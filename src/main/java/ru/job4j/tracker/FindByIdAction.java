package ru.job4j.tracker;

public class FindByIdAction implements  UserAction {
    @Override
    public String name() {
        return "Find by id Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id for search: ");
        Item temp = tracker.findById(id);
        if (temp != null) {
            System.out.println(temp);
        } else {
            System.out.println("Application with this id was not found" + id);
        }
        return true;
    }
}
