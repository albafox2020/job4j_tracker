package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.print("Enter id for correction: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter name item: ");
                String name = scanner.nextLine();
                Item items = new Item(name);
                if (tracker.replace(id, items)) {
                    System.out.println("Successfully");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.print("Enter id for removing: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Successfully");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                System.out.print("Enter id for search: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item news = new Item(scanner.nextLine());
                Item temp = tracker.findById(id);
                if (temp != null) {
                    System.out.println(temp);
                } else {
                    System.out.println("Application with this id was not found" + id);
                }
            } else if (select == 5) {
                System.out.print("Enter name for search: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(item);
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
