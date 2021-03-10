package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker trackers = new Tracker();
        Item item1 = new Item("Test 1");
        Item item2 = new Item("Test 2");
        trackers.add(item1);
        trackers.add(item2);
        System.out.println(trackers.findById(1).getName());
        System.out.println(trackers.findById(2).getName());
    }
}
