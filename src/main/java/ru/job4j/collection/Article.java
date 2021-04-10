package ru.job4j.collection;

import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originText = origin.split("[^а-яА-Яa-zA-Z]");
        String[] lineText = line.split("[^а-яА-Яa-zA-Z]");
        HashSet<String> check = new HashSet<>();
        for (String orig : originText) {
            check.add(orig);
        }
        for (String original : lineText)  {
            if (!check.contains(original)) {
                rsl = false;
                break;
            }
        } return rsl;
    }
}
