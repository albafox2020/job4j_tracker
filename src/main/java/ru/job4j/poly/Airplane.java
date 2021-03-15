package ru.job4j.poly;

public class Airplane implements  Vehicle {
    public static void move() {
        System.out.println(Airplane.class.getSimpleName() + "Летает по воздуху");
    }
}
