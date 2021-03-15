package ru.job4j.poly;

public class VehicleClub {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new BusVehicle();

        Vehicle[] vehicles = new Vehicle[] {airplane, train, bus};
        for (Vehicle v : vehicles) {
            Vehicle.move();
        }
    }
}
