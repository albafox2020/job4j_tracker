package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);

        String[] namesTrue = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthCmpTrue = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(namesTrue, lengthCmp);
    }
}
