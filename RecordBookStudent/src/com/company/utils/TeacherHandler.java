package com.company.utils;

import com.company.users.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public class TeacherHandler implements Handler {

    private TeacherUtils teacherUtils = new TeacherUtils(); //можно static

    @Override
    public List read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String line;
        List<Teacher> list = new ArrayList();

        while ((line = br.readLine()) != null) {
            list.add(teacherUtils.parseTeacher(line));
        }

        return list;
    }

    @Override
    public void write(String filename) {

    }
}