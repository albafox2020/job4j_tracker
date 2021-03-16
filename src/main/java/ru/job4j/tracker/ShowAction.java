package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] temp = tracker.findAll();
        for (Item item : temp) {
            System.out.println(item);
        }
        return true;
    }
}
