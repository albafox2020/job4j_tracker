package ru.job4j.tracker;

import java.util.List;

public class FindByIdAction implements  UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id for search: ");
        Item temp = tracker.findById(id);
        if (temp != null) {
            out.println(temp);
        } else {
            out.println("Application with this id was not found" + id);
        }
        return true;
    }
}
