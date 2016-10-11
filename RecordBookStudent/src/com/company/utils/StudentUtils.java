package com.company.utils;

import com.company.items.Subject;
import com.company.users.Student;

import java.util.StringTokenizer;

/**
 * Created by Олег on 29.09.2016.
 */
public class StudentUtils {

    public Student parseStudent (String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");

        Student student = new Student();

        student.setName(stringTokenizer.nextToken());
        student.setSurname(stringTokenizer.nextToken());
        student.setGroupNumber(Integer.parseInt(stringTokenizer.nextToken()));
        student.setPersonalBookNumber(Integer.parseInt(stringTokenizer.nextToken()));
        student.setYearRevenue(Integer.parseInt(stringTokenizer.nextToken()));


        return student;
    }
}