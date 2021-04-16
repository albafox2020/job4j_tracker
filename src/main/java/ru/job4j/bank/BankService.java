package ru.job4j.bank;

import ru.job4j.stream.Students;

import java.util.*;

/**
 * @author albafox
 * @version 1.0
 * Class for service accounts of clients
 */

public class BankService {

    /**
     * This object contain data
     */

    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Method create a new user
     * @param user accept user name
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     *Creating new account
     * @param passport unique passport
     * @param account account in database
     */

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    public Optional<User> findByPassport(String passport) {
        Set<User> setUsers = users.keySet();
        return setUsers.stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

     public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccounts = users.get(user.get());
            return userAccounts.stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if  (srcAccount.isPresent() && srcAccount.get().getBalance() >= amount
                && destAccount.isPresent()) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
