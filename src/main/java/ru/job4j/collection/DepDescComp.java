package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] str1 = o1.split("/");
        String[] str2 = o2.split("/");
        int rsl = 0;
        if (str1[0].equals(str2[0])) {
            rsl = o1.compareTo(o2);
        } else {
            rsl = o2.compareTo(o1);
        }
        return rsl;
    }
}
