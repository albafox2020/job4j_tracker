package ru.job4j.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortItemTest {

    @Test
    public void whenHaveListThenSortedAtLengthName() {
        Item itemthree = new Item("AAA");
        Item itemone = new Item("A");
        Item itemtwo = new Item("AA");
        List<Item> items = new ArrayList<>();
        items.add(itemone);
        items.add(itemtwo);
        items.add(itemthree);
        SortItem sort = new SortItem();
        List<Item> result = sort.sortByName(items);
        assertThat(result.get(1), is(itemtwo));
    }

    @Test
    public void whenHaveListThenSortedAtLengthNameWaning() {
        Item itemthree = new Item("AAA");
        Item itemone = new Item("A");
        Item itemtwo = new Item("AA");
        List<Item> items = new ArrayList<>();
        items.add(itemone);
        items.add(itemtwo);
        items.add(itemthree);
        SortItem sort = new SortItem();
        List<Item> result = sort.sortByNameWaning(items);
        assertThat(result.get(0), is(itemthree));
    }
}