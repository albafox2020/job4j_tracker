package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public boolean go() {
       boolean goBus = true;
       return goBus;
    }

    @Override
    public int passengers(int countPassengers) {
       int ticketPrice = 35;
       return countPassengers * ticketPrice;
    }

    @Override
    public int refuel(int countFuel) {
        int curs = 80;
        return countFuel * curs;
    }
}
