package com.company.users;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public class Student {
    private String name;
    private String surname;
    private int groupNumber;
    private int yearRevenue; // год поступления
    private int personalBookNumber; //номер зачетки

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getPersonalBookNumber() {
        return personalBookNumber;
    }

    public void setPersonalBookNumber(int personalBookNumber) {
        this.personalBookNumber = personalBookNumber;
    }

    public int getYearRevenue() {
        return yearRevenue;
    }

    public void setYearRevenue(int yearRevenue) {
        this.yearRevenue = yearRevenue;
    }


    public void printStudent(List<Student> list2) {
        Collections.sort(list2,
                new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o1.toString().compareTo(o2.toString());
                    }
                }
        );

        Collections.sort(list2,
                new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o2.getGroupNumber() - (o1.getGroupNumber());
                    }
                }
        );

        for (Student student : list2)
            System.out.println(student);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", personalBookNumber=" + personalBookNumber +
                '}';
    }
}
