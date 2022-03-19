package com.home_works.HomeWork6;

import java.util.ArrayList;
import java.util.List;

public class Zavuch {
    private String firstName;
    private String lastName;
    List<Student> student = new ArrayList<>();
    List<Student> naOtchislenie = new ArrayList<>();

    public Zavuch(String firstName, String lastName, List<Student> student) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.student = student;
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

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public List<Student> getNaOtchislenie() {
        return naOtchislenie;
    }

    public void setNaOtchislenie(List<Student> naOtchislenie) {
        this.naOtchislenie = naOtchislenie;
    }

    @Override
    public String toString() {
        return "Zavuch{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", student=" + student +
                ", naOtchislenie=" + naOtchislenie +
                '}';
    }

    public void printAllStudents() {
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).getFirstName() + " " + student.get(i).getLastName());
        }
    }

    public void nameSubjects(String name) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getSubject().contains(name))
                System.out.print(student.get(i).getFirstName() + " " + student.get(i).getLastName() + "; ");
        }
        System.out.println();
    }

    public void nameZachet(String name) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getZachet().contains(name))
                System.out.print(student.get(i).getFirstName() + " " + student.get(i).getLastName() + "; ");
        }
        System.out.println();
    }

    public void nameExam(String name) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getExams().contains(name))
                System.out.print(student.get(i).getFirstName() + " " + student.get(i).getLastName() + "; ");
        }
        System.out.println();
    }

    public void avgMark() {
        for (int i = 0; i < student.size(); i++) {
            double sum = 0;
            int count = 0;
            double avg = 0;
            for (int n = 0; n < student.get(i).getMark().size(); n++) {
                sum += student.get(i).getMark().get(n);
                count += 1;
            }
            avg = sum / count;
            System.out.println(student.get(i).getFirstName() + " " + student.get(i).getLastName() +
                    " " + "средний балл: " + avg + "; ");

            if (avg < 4 && !student.get(i).isHomework()) {
                naOtchislenie.add(student.get(i));
            }
        }
        System.out.println();
        System.out.print("на отчисление: ");

        for (int i = 0; i < naOtchislenie.size(); i++) {
            System.out.print(naOtchislenie.get(i).getFirstName() + " " + naOtchislenie.get(i).getLastName() + "; ");
        }
        System.out.println();
    }
}
