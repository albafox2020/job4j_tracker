package ru.job4j.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortItemWTest {

    @Test
    public void whenHaveListThenSortedAtLengthNameWaning() {
        Item itemthree = new Item("AAA");
        Item itemone = new Item("A");
        Item itemtwo = new Item("AA");
        List<Item> items = new ArrayList<>();
        items.add(itemone);
        items.add(itemtwo);
        items.add(itemthree);
        SortItemW sortW = new SortItemW();
        List<Item> result = sortW.sortByNameWaning(items);
        assertThat(result.get(0), is(itemthree));
    }
}