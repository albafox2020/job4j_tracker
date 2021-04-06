package ru.job4j.sort;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class SortByIdW implements Comparator<Item>  {
    public int compare(Item o1, Item o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
