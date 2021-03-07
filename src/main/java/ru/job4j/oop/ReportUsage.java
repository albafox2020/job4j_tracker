package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        JSONRepor report = new JSONRepor();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
