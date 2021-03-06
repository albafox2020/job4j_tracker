package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return  first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = max(second, third);
        return max(first, temp);
    }

    public static int max(int first, int second, int third, int fourth) {
        int tempV2 = max(second, third, fourth);
        return max(first, tempV2);
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
