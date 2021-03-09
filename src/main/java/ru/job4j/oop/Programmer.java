package ru.job4j.oop;

public class Programmer extends Engineer {
    private boolean expir;
    private String languages;

    public Programmer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
        this.expir = expir;
        this.languages = languages;
    }

    public void testCod() {
    }
}
