package com.company;

import com.company.items.Subject;
import com.company.utils.Handler;
import com.company.utils.SessionHandler;

import java.io.IOException;
import java.util.List;

public class Main {

    public static int numberOfSession = 3;

    public static void main(String[] args) {
        SessionHandler sessionHandler = new SessionHandler();

        try {
            sessionHandler.write(sessionHandler.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}