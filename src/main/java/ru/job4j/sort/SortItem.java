package ru.job4j.sort;

import ru.job4j.tracker.Item;

import java.util.Comparator;
import java.util.List;

public class SortItem {
    public List<Item> sortByName(List<Item> list) {
        list.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });
        return list;
    }

    public List<Item> sortByNameWaning(List<Item> list) {
        list.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Integer.compare(o2.getName().length(), o1.getName().length());
            }
        });
        return list;
    }
}
