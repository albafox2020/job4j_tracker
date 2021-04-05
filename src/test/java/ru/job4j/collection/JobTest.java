package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDoubleName() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenIncrByName() {
        Comparator<Job> cmpName = new JobIncrByName();
        int rsl = cmpName.compare(
                new Job("Alex", 3),
                new Job("Boris", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncrDoubleName() {
        Comparator<Job> cmpName = new JobIncrByName();
        int rsl = cmpName.compare(
                new Job("Alex", 3),
                new Job("Alex", 2)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenDestByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Konstantin", 1),
                new Job("Boris", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenIncrByPriority1() {
        Comparator<Job> cmpName = new JobIncrByPriority();
        int rsl = cmpName.compare(
                new Job("Konstantin", 1),
                new Job("Boris", 2)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenDescByPriority1() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Konstantin", 1),
                new Job("Boris", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}