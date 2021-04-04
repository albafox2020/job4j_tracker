package ru.job4j.oop;

public class Dentist extends Doctor {

    public Dentist(String name, String surname, String education, int birthday, boolean ardinatur) {
        super(name, surname, education, birthday, ardinatur);
    }

    public static void main(String[] args) {
        Doctor dent = new Dentist("Oleg", "Petrov", "higher", 1990, true);
        dent.diagnosis();
    }
}
