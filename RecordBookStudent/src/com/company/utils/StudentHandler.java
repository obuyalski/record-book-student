package com.company.utils;

import com.company.users.Student;

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
public class StudentHandler implements Handler {

    @Override
    public List read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String line;
        List<Student> list = new ArrayList();

        while ((line = br.readLine()) != null) {
            list.add(parseStudent(line));
        }

        return list;
    }

    private Student parseStudent(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        Student student = new Student();

        student.setName(stringTokenizer.nextToken());
        student.setSurname(stringTokenizer.nextToken());
        student.setGroupNumber(Integer.parseInt(stringTokenizer.nextToken()));
        student.setPersonalBookNumber(Integer.parseInt(stringTokenizer.nextToken()));
        student.setYearRevenue(Integer.parseInt(stringTokenizer.nextToken()));

        return student;
    }

    @Override
    public void write(String filename, List list) throws IOException {

    }

}
