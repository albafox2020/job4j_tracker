package ru.job4j.sort;

import ru.job4j.tracker.Item;
import java.util.Comparator;

public class SortItemW implements Comparator<Item> {
    public int compare(Item o1, Item o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
