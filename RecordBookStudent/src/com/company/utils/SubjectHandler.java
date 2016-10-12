package com.company.utils;

import com.company.items.Subject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Олег on 12.10.2016.
 */
public class SubjectHandler implements Handler {

    @Override
    public List read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        String line;
        List<Subject> list = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            list.add(parseSubject(line));
        }

        return list;
    }

    private Subject parseSubject(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        Subject subject = new Subject();

        subject.setName(stringTokenizer.nextToken());
        subject.setHours(Integer.parseInt(stringTokenizer.nextToken()));

        return subject;
    }

    @Override
    public void write(String filename, List list) throws IOException {

    }
}
