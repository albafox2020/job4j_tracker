package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        } if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        /* if contains throw ElementAbuseException */
        return true;
    }

    public static void main(String[] args) {
        String[] value = {"abc", "cba"};
        try {
            indexOf(value, "cba");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static class ElementAbuseException extends Exception {
    }
}
