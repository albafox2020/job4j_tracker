package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> temp = tracker.findAll();
        for (Item item : temp) {
            out.println(item);
        }
        return true;
    }
}
