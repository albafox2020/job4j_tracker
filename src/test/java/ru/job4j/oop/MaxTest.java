package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To2Then4() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax5To9Then9() {
        int result = Max.max(5, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To5To7Then7() {
        int result = Max.max(5, 5,7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax2To5To1Then5() {
        int result = Max.max(2, 5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To9To2To2Then9() {
        int result = Max.max(5, 9, 2, 2);
        assertThat(result, is(9));
    }
}