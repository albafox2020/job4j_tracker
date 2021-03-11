package ru.job4j.tracker;

import java.util.Arrays;

public class  Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int sizeName = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                rsl[sizeName] = item;
                sizeName++;
            }
        }
        rsl = Arrays.copyOf(rsl, sizeName);
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int indexReplace = indexOf(id);
        if (indexReplace != -1) {
            items[indexReplace] = item;
            item.setId(id);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int indexDell = indexOf(id);
        if (indexDell != -1 && items[indexDell] != null) {
            items[indexDell] = null;
            System.arraycopy(items, indexDell + 1, items, indexDell, size - indexDell);
            size--;
            return true;
        }
        return false;
    }
}