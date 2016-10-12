package com.company;

import com.company.items.DataBase;
import com.company.utils.SessionHandler;

import java.io.IOException;

public class Main {

    public static int numberOfSession = 3;

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        try {
            dataBase.prepare();



        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}