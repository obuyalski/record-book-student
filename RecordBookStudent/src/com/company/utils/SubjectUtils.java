package com.company.utils;

import com.company.items.Subject;

import java.util.StringTokenizer;

/**
 * Created by Олег on 06.10.2016.
 */
public class SubjectUtils {
    public Subject parseSubject (String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");

        Subject subject = new Subject();

        subject.setName(stringTokenizer.nextToken());
        subject.setHours(Integer.parseInt(stringTokenizer.nextToken()));
        return subject;
    }
}
