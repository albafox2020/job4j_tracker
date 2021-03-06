package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("The charge of the first battery was : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("Now Charge of the first battery : " + first.load + ". second : " + second.load);

    }
}
