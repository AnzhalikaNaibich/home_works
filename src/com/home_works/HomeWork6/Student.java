package com.home_works.HomeWork6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int kurs;
    private List<Integer> mark = new ArrayList<>();
    private List<String> subject = new ArrayList<>();
    private List<String> zachet = new ArrayList<>();
    private List<String> exams = new ArrayList<>();
    private boolean homework;

    public Student(String firstName, String lastName, int age, int kurs, List<Integer> mark, List<String> subject,
                   List<String> zachet, List<String> exams, boolean homework) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.kurs = kurs;
        this.mark = mark;
        this.subject = subject;
        this.zachet = zachet;
        this.exams = exams;
        this.homework = homework;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubjects(List<String> subjects) {
        this.subject = subjects;
    }

    public List<String> getZachet() {
        return zachet;
    }

    public void setZachet(List<String> zachet) {
        this.zachet = zachet;
    }

    public List<String> getExams() {
        return exams;
    }

    public void setExams(List<String> exams) {
        this.exams = exams;
    }

    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", kurs=" + kurs +
                ", mark=" + mark +
                ", subjects=" + subject +
                ", zachet=" + zachet +
                ", exams=" + exams +
                ", homework=" + homework +
                '}';
    }

}
