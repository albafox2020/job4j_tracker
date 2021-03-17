package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        int id = input.askInt("Enter id for correction: ");
        String name = input.askStr("Enter name item: ");
        Item items = new Item(name);
        if (tracker.replace(id, items)) {
            out.println("Successfully");
        } else {
            out.println("Error");
        }
        return true;
    }
}
