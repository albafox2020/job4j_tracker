package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession(String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public static void main(String[] args) {
        Profession prof = new Profession("Andrey", "Ivan", "higher", 1990);
    }
}
