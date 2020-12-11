package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Marahin Sergey Vyacheslavovich");
        student.setGroup("2048FM");
        student.setAdmission(new Date());
        System.out.println("Student: " + student.getName() + System.lineSeparator() + "Group: " + student.getGroup() + System.lineSeparator() + "Date:" + student.getAdmission());
    }
}
