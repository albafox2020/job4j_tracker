package ru.job4j.tracker;

import java.util.List;

public class ShowAllItemsIncrease implements UserAction {
    private final Output out;

    public ShowAllItemsIncrease(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items by increase";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> temp = tracker.findAll();
        temp.sort(new SortByNameIncrease());
        for (Item item : temp) {
            out.println(item);
        }
        return true;
    }
}
