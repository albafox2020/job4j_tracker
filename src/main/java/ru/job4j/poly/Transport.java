package ru.job4j.poly;

public interface Transport {
    public boolean go();

    public int passengers(int countPassengers);

    public int refuel(int countFuel);
}
