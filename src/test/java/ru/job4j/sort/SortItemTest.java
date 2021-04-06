package ru.job4j.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class SortItemTest {

    @Test
    public void whenSortByName1() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, "A"));
        items.add(new Item(3, "C"));
        items.add(new Item(1, "B"));
        Comparator<Item> comparator = new SortItem().thenComparing(new SortById());
        items.sort(comparator);
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(2, "A"));
        expected.add(new Item(1, "B"));
        expected.add(new Item(3, "C"));
        assertEquals(expected.toString(), items.toString());
    }

    @Test
    public void whenSortByName2() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, "L-Test"));
        items.add(new Item(2, "T-Test"));
        items.add(new Item(1, "K-Test"));
        Comparator<Item> comparator = new SortItem().thenComparing(new SortById());
        items.sort(comparator);
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(1, "K-Test"));
        expected.add(new Item(3, "L-Test"));
        expected.add(new Item(2, "T-Test"));
        assertEquals(expected.toString(), items.toString());
    }
}