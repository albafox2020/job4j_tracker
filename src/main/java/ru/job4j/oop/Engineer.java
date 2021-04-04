package ru.job4j.oop;

public class Engineer extends Profession {
    private int experience;

    public Engineer(String name, String surname, String education, int birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public void level() {

    }

    public void workHours() {

    }

    public static void main(String[] args) {
        Engineer petya = new Engineer("Petya", "Ivanov", "higher", 1900, 10);

        petya.level();

        Profession pr = new Engineer("Ivan", "Ivanov", "higher", 1930, 10);

        pr.getBirthday();
    }
}
