package com.company.utils;

import com.company.users.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Олег on 29.09.2016.
 */
public class TeacherHandler implements Handler {

    @Override
    public List read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String line;
        List<Teacher> list = new ArrayList();

        while ((line = br.readLine()) != null) {
            list.add(parseTeacher(line));
        }

        return list;
    }

    private Teacher parseTeacher(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        Teacher teacher = new Teacher();

        teacher.setName(stringTokenizer.nextToken());
        teacher.setSign(stringTokenizer.nextToken());
        teacher.setSub(stringTokenizer.nextToken());
        teacher.setNumGroup(Integer.parseInt(stringTokenizer.nextToken()));
        teacher.setNumSess(Integer.parseInt(stringTokenizer.nextToken()));

        return teacher;
    }

    @Override
    public void write(String filename, List list) throws IOException {

    }


}
