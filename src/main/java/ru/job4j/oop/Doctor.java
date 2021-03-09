package ru.job4j.oop;

public class Doctor extends Profession {
    private boolean ardinatur;

    public Doctor(String name, String surname, String education, int birthday, boolean ardinatur) {
        super(name, surname, education, birthday);
        this.ardinatur = ardinatur;
    }

    public void diagnosis() {
    }
}
