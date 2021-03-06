package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово." + eng;
    }

    public static void main(String[] args) {
        DummyDic dammy = new DummyDic();
        String eng = "Блаблабла";
        String allWords = dammy.engToRus(eng);
        System.out.println(allWords);
    }
}
