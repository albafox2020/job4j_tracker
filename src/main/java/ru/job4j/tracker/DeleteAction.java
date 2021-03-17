package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id for removing: ");
        if (tracker.delete(id)) {
            out.println("Successfully");
        } else {
            out.println("Error");
        }
        return true;
    }
}
