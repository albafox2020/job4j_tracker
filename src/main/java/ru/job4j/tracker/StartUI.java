package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.print("Application added");
            } else if (select == 1) {
                Item[] temp = tracker.findAll();
                for (Item item : temp) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                int id = Integer.parseInt(input.askStr("Enter id for correction: "));
                String name = input.askStr("Enter name item: ");
                Item items = new Item(name);
                if (tracker.replace(id, items)) {
                    System.out.println("Successfully");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                int id = Integer.parseInt(input.askStr("Enter id for removing: "));
                if (tracker.delete(id)) {
                    System.out.println("Successfully");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                int id = Integer.parseInt(input.askStr("Enter id for search: "));
                Item news = new Item(input.askStr(" "));
                Item temp = tracker.findById(id);
                if (temp != null) {
                    System.out.println(temp);
                } else {
                    System.out.println("Application with this id was not found" + id);
                }
            } else if (select == 5) {
                String name = input.askStr("Enter name for search: ");
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(item[i]);
                    }
                } else {
                    System.out.println("Application with this name was not found" + name);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
