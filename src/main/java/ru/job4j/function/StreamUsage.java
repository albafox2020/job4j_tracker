package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> tasks = new ArrayList<>();
                tasks.add(10);
                tasks.add(-20);
                tasks.add(7);
        List<Integer> positiv = tasks.stream().filter(
                n -> n > 0
        ).collect(Collectors.toList());
        positiv.forEach(System.out::println);
    }
}
