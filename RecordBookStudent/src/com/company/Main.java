package com.company;

import com.company.items.DataBase;
import com.company.utils.DataBaseListener;

import java.io.IOException;

public class Main {

    public static int numberOfSession = 3;

    public static void main(String[] args) {
        try {
            DataBaseListener listener = new DataBaseListener();

            listener.start();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}