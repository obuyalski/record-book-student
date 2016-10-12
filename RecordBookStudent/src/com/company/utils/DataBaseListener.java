package com.company.utils;

import com.company.items.DataBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Олег on 12.10.2016.
 */
public class DataBaseListener {
    private DataBase dataBase;
    private BufferedReader br;

    public DataBaseListener() throws IOException {
        dataBase = new DataBase();
        dataBase.prepare();

        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws IOException {
        String line;
        printConsoleInterface();
        while ((line = br.readLine()) != null) {
            if (line.equals("1")) {
                createDocument();
            } else if (line.equals("2")) {
                writeDocument();
            } else {
                System.out.println("Goodbye :)");
                break;
            }
            printConsoleInterface();
        }
    }

    private void printConsoleInterface() {
        System.out.println("Available commands: ");
        System.out.println("1. Create document");
        System.out.println("2. Write document");
        System.out.println("3. Exit");
        System.out.println("Enter number (1-3) : ");
    }

    private void createDocument() throws IOException {
        System.out.println("Enter course number: ");
        int course = Integer.parseInt(br.readLine());
        System.out.println("Enter group number: ");
        int group = Integer.parseInt(br.readLine());
        System.out.println("Enter subject name: ");
        String subjectName = br.readLine();

        dataBase.createDocument(course, group, subjectName);
    }

    private void writeDocument() {
//        dataBase.writeDocument();
    }
}
