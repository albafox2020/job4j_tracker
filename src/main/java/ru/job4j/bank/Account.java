package ru.job4j.bank;

import java.util.Objects;
/**
 * @author albafox
 * @version 1.0
 * Class frame work with data
 */
public class Account {
    /**
     * account number details
     */
    private String requisite;
    /**
     * account balance
     */
    private double balance;
    /**
        * data on props and balance
       * @param requisite is the account number
       * @param balance - the amount of money on the account
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * @return gives back requisite
     */
    public String getRequisite() {
        return requisite;
    }
    /**
     * @deprecated method is not using
     * @param requisite initialisation parameter of requisite
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * @return gives balance
     */

    public double getBalance() {
        return balance;
    }

    /**
     * @param balance initialisation parameter of balance
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return equals method for checking items
     */

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (o == null || getClass() != o.getClass()) {
            result = false;
        } else {
            Account account = (Account) o;
            result = Objects.equals(requisite, account.requisite);
        }
        return result;
    }

    /**
     * @return a hash code for a given string
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
