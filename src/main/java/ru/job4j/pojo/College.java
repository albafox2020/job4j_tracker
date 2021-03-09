package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("202-BK");
        student.setRecDate(01 / 2020 / 9);

        System.out.println("FIO: " + student.getFio() + ", Group: " + student.getGroup() + ", Rec data: " + student.getRecDate());
    }
}
