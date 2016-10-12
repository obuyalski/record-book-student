package com.company.items;

import com.company.users.Student;
import com.company.users.Teacher;
import com.company.utils.Handler;
import com.company.utils.SessionHandler;
import com.company.utils.StudentHandler;
import com.company.utils.TeacherHandler;

import java.io.IOException;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public class DataBase {
    private static String STUDENTS_FILE_NAME = "students.txt";
    private static String TEACHERS_FILE_NAME = "teachers.txt";

    private SessionHandler sessionHandler;
    private Handler studentHandler;
    private Handler teacherHandler;

    private List<Session> sessions;
    private List<Student> students;
    private List<Teacher> teachers;

    public DataBase() {
        sessionHandler = new SessionHandler();
        studentHandler = new StudentHandler();
        teacherHandler = new TeacherHandler();
    }

    public void prepare() throws IOException {
        sessions = sessionHandler.read();
        students = studentHandler.read(STUDENTS_FILE_NAME);
        teachers = teacherHandler.read(TEACHERS_FILE_NAME);
    }
}

