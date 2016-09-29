package com.company;

import com.company.users.Student;
import com.company.utils.StudentHandler;
import com.company.utils.Handler;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Handler handler = new StudentHandler();
        List<Student> list;
        try {

            list = handler.read("students.txt");
            for (Student student : list) {
                System.out.println(student);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
