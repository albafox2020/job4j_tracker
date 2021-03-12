package ru.job4j.io;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner sc = new Scanner(System.in);
        String answ = sc.nextLine();
        System.out.println("Answer: " + answ);
        int answer = new Random().nextInt(3);
        switch (answer) {
            case (1):
                System.out.println("Да");
                break;
            case (2):
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
                break;
        }
    }
}
