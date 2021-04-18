package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(90, "Surname9")
        );
        School sc = new School();
        Predicate<Student> pr = x -> x.getScore() >= 70;
        Map<String, Student> rsl = sc.collect(students, pr);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname7", new Student(70, "Surname7"));
        expected.put("Surname9", new Student(90, "Surname9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student(20, "Surname2"),
                new Student(30, "Surname3"),
                new Student(50, "Surname5"),
                new Student(60, "Surname6"),
                new Student(80, "Surname8")
        );
        School sc = new School();
        Predicate<Student> pr = x -> x.getScore() >= 50 && x.getScore() < 70;
        Map<String, Student> rsl = sc.collect(students, pr);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname5", new Student(50, "Surname5"));
        expected.put("Surname6", new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname6"),
                new Student(90, "Surname9")
        );
        School sc = new School();
        Predicate<Student> pr = x -> x.getScore() < 50;
        Map<String, Student> rsl = sc.collect(students, pr);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", new Student(10, "Surname1"));
        expected.put("Surname3", new Student(30, "Surname3"));
        expected.put("Surname4", new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }
}