package ru.job4j.oop;

public class Engineer extends Profession {
    private int experience;

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public String level() {
    }

    public int workHours() {
    }
}
