package com.company.utils;

import com.company.users.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public class StudentHandler implements Handler {

    private StudentUtils studentUtils = new StudentUtils(); //можно static

    @Override
    public List read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String line;
        List<Student> list = new ArrayList();

        while ((line = br.readLine()) != null) {
            list.add(studentUtils.parseStudent(line));
        }

        return list;
    }

    @Override
    public void write(String filename) {

    }
}
