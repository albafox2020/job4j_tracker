package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        String rsl = null;
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        if (index >= 0 && index < data.length) {
            rsl = data[index];
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 4);
        System.out.println(rsl);
    }
}
