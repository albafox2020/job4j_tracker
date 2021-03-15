package ru.job4j.poly;

public class Train implements Vehicle {
    public static void move() {
        System.out.println(Train.class.getSimpleName() + "Ездит по рельсам");
    }
}
