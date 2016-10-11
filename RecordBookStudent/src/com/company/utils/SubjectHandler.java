package com.company.utils;

import com.company.items.Subject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Олег on 12.10.2016.
 */
public class SubjectHandler implements Handler{
    private SubjectUtils subjectUtils = new SubjectUtils(); //можно static

    @Override
    public List read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String line;
        List<Subject> list = new ArrayList();

        while ((line = br.readLine()) != null) {
            list.add(subjectUtils.parseSubject(line));
        }

        return list;
    }

    @Override
    public void write(String filename) {

    }
}
