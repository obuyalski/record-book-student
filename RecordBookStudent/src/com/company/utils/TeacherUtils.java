package com.company.utils;

import com.company.users.Student;
import com.company.users.Teacher;

import java.util.StringTokenizer;

/**
 * Created by Олег on 05.10.2016.
 */
public class TeacherUtils {
    public Teacher parseTeacher(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");

        Teacher teacher = new Teacher();

        teacher.setName(stringTokenizer.nextToken());
        teacher.setSign(stringTokenizer.nextToken());
        teacher.setSub(stringTokenizer.nextToken());
        teacher.setNumGroup(Integer.parseInt(stringTokenizer.nextToken()));
        teacher.setNumSess(Integer.parseInt(stringTokenizer.nextToken()));

        return teacher;
    }
}
