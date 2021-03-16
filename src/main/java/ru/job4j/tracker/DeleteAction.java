package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id for removing: ");
        if (tracker.delete(id)) {
            System.out.println("Successfully");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
