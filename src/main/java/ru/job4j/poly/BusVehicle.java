package ru.job4j.poly;

public class BusVehicle implements Vehicle {
    public static void move() {
        System.out.println(BusVehicle.class.getSimpleName() + "Двигается по скоростным трассам");
    }
}
