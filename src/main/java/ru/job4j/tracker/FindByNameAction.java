package ru.job4j.tracker;

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
        String name = input.askStr("Enter id for search: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                out.println(item[i]);
            }
        } else {
            out.println("Application with this name was not found" + name);
        }
        return true;
    }
}
