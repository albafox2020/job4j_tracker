package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    @SuppressWarnings("checkstyle:ParenPad")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            while (matches > 3 || matches < 1) {
                System.out.println("Вы ввели число больше 3 или меньше 1"
                        + ", введите заново число спичек");
                matches = Integer.parseInt(input.nextLine());
            }
            turn = !turn;
            count = count - matches;
            System.out.println("Осталось списчек: " + count);
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}