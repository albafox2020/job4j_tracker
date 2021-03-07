package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return  first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
        int result2 = Max.max(2, 3, 4);
        System.out.println(result2);
        int result3 = Max.max(2, 3, 4,7);
        System.out.println(result3);
    }
}
