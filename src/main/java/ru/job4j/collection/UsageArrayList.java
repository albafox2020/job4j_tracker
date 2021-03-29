package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Petr");
        arr.add("Ivan");
        arr.add("Stepan");
        for (Object name : arr) {
            System.out.println(name);
        }
    }
}
