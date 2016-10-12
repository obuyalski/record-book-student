package com.company.items;

import com.company.users.Student;
import com.company.users.Teacher;
import com.company.utils.Handler;
import com.company.utils.SessionHandler;
import com.company.utils.StudentHandler;
import com.company.utils.TeacherHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public class DataBase {
    private static String STUDENTS_FILE_NAME = "students.txt";
    private static String TEACHERS_FILE_NAME = "teachers.txt";
    private static String DOCUMENT_FILE_NAME = "document.txt";

    private SessionHandler sessionHandler;
    private Handler studentHandler;
    private Handler teacherHandler;

    private List<Session> sessions;
    private List<Student> students;
    private List<Teacher> teachers;

    private BufferedWriter bw;

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

    public void createDocument(int course, int group, String subjectName) throws IOException {
        bw = new BufferedWriter(new FileWriter(new File(DOCUMENT_FILE_NAME)));

        bw.write("Document for '" + subjectName + "'. Group: " + group + ". Course " + course + "\n");

        List<Student> groupList = getStudents(group);
        Teacher teacher = getTeacher(group, subjectName);

        int idx = 1;
        for (Student student : groupList) {
            bw.write(idx + ". " + student.getName() + " " + student.getSurname() + "\t\t\n");
            idx++;
        }

        bw.write("Teacher: " + teacher.getName() + " \t\tSign: " + teacher.getSign());

        bw.flush();
        bw.close();
    }

    private Teacher getTeacher(int group, String subjectName) {
        for (Teacher teacher : teachers) {
            if (teacher.getNumGroup() == group && teacher.getSub().equalsIgnoreCase(subjectName)) {
                return teacher;
            }
        }

        return null;
    }

    private List<Student> getStudents(int group) {
        List<Student> list = new ArrayList<>();

        for (Student student : students) {
            if (student.getGroupNumber() == group) {
                list.add(student);
            }
        }

        return list;
    }
}

