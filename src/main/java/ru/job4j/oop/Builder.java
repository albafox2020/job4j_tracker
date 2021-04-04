package ru.job4j.oop;

public class Builder extends Engineer {
    private int level;

    public Builder(String name, String surname, String education, int birthday, int level) {
        super(name, surname, education, birthday);
        this.level = level;
    }

    public void areaBuild() {

    }

    public static void main(String[] args) {
        Engineer build = new Builder("Petr", "Vasechkin", "higher", 1980, 10);
        build.workHours();
    }
}
