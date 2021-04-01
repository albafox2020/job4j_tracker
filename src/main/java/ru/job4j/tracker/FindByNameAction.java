package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByNameAction implements  UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name for search: ");
        List<Item> item = tracker.findByName(name);
        if (item.size() > 0) {
            for (Item items : item) {
                out.println(items);
            }
        } else {
            out.println("Application with this name was not found" + name);
        }
        return true;
    }
}
