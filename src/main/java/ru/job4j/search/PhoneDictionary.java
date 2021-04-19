package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        Predicate<Person> namePerson = p -> p.getName().contains(key);
        Predicate<Person> surnamePerson = p -> p.getSurname().contains(key);
        Predicate<Person> addressPerson = p -> p.getAddress().contains(key);
        Predicate<Person> phonePerson = p -> p.getPhone().contains(key);
        Predicate<Person> combine = namePerson.or(surnamePerson).or(addressPerson).or(phonePerson);
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
