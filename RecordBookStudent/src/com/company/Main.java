package com.company;

import com.company.items.Subject;
import com.company.users.Student;
import com.company.users.Teacher;
import com.company.utils.StudentHandler;
import com.company.utils.Handler;
import com.company.utils.SubjectHandler;
import com.company.utils.TeacherHandler;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Handler handler = new StudentHandler();
        List<Student> list = null;
        try {

            list = handler.read("students.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        Student student = new Student();
        student.printStudent(list);

        System.out.println();
        Handler handler2 = new TeacherHandler();
        List<Teacher> list2 = null;
        try {

            list2 = handler2.read("teachers.txt");
            for (Teacher teacher : list2) {
                System.out.println(teacher);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println();
//        Handler handler3 = new SubjectHandler();
//        List<Subject> list3 = null;
//        try {
//
//            list3 = handler3.read("academicPlan.txt");
//            for (Subject subject : list3) {
//                System.out.println(subject);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}