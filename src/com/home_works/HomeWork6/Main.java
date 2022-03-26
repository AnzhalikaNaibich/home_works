package com.home_works.HomeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Maks", "Volkov", 27, 1,
                Arrays.asList(3,3,3,4,4),
                Arrays.asList("History","Math", "Biology", "Geography", "Literature"),
                Arrays.asList("History", "Geography", "Literature"),
                Arrays.asList("Math", "Biology"),
                false);
        Student s2 = new Student("Ivan", "Petrov", 23, 1,
                Arrays.asList(4,4,5),
                Arrays.asList("History","Math", "Biology"),
                Arrays.asList("History"),
                Arrays.asList("Math", "Biology"),
                true);
        Student s3 = new Student("Semen", "Semonov", 25, 1,
                Arrays.asList(4,3,5,4),
                Arrays.asList("History","Math", "Biology", "Geography"),
                Arrays.asList("History", "Geography"),
                Arrays.asList("Math", "Biology"),
                true);
        Student s4 = new Student("Oleg", "Antonovich", 21, 1,
                Arrays.asList(3,2,3),
                Arrays.asList("Biology", "Geography", "Literature"),
                Arrays.asList("Geography", "Biology"),
                Arrays.asList("Literature"),
                false);

        Zavuch zavuch = new Zavuch("Olga", "Ivanova", Arrays.asList(s1, s2, s3, s4));

        zavuch.printAllStudents();
        System.out.println();

        System.out.print("Изучает математику: ");
        zavuch.printStudentsByNameSubject("Math");

        System.out.print("Зачёт по истории: ");
        zavuch.printStudentsByNameZachet("History");

        System.out.print("Экзамен по литературе: ");
        zavuch.printStudentsByNameExam("Literature");

        System.out.println();

        zavuch.printStudentsByAvgMark();
    }
}
