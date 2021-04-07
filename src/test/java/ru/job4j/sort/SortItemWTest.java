package ru.job4j.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class SortItemWTest {

    @Test
    public void whenSortByNameWaning() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, "L-Test"));
        items.add(new Item(2, "T-Test"));
        items.add(new Item(1, "K-Test"));
        Comparator<Item> comparator = new SortItemW().thenComparing(new SortById());
        items.sort(comparator);
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(2, "T-Test"));
        expected.add(new Item(3, "L-Test"));
        expected.add(new Item(1, "K-Test"));
        assertEquals(expected, items);
    }

    @Test
    public void whenSortByNameWhenDoubleNameWaning() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(3, "L-Test"));
        items.add(new Item(2, "T-Test"));
        items.add(new Item(1, "T-Test"));
        Comparator<Item> comparator = new SortItemW().thenComparing(new SortByIdW());
        items.sort(comparator);
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(2, "T-Test"));
        expected.add(new Item(1, "T-Test"));
        expected.add(new Item(3, "L-Test"));
        assertEquals(expected, items);
    }
}