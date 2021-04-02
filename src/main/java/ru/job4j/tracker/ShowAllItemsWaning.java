package ru.job4j.tracker;

import java.util.List;

public class ShowAllItemsWaning implements UserAction {
    private final Output out;

    public ShowAllItemsWaning(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items by waning";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> temp = tracker.findAll();
        temp.sort(new SortByNameWaning());
        for (Item item : temp) {
            out.println(item);
        }
        return true;
    }
}
