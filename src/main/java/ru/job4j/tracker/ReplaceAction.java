package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Replace Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("Enter id for correction: ");
        String name = input.askStr("Enter name item: ");
        Item items = new Item(name);
        if (tracker.replace(id, items)) {
            System.out.println("Successfully");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
