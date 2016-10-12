package com.company.utils;

import com.company.items.Session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.company.Main.numberOfSession;

/**
 * Created by Олег on 12.10.2016.
 */
public class SessionHandler {

    public List read() throws IOException {
        List<Session> list = new ArrayList<>();

        for (int i = 0; i < numberOfSession; ++i) {
            list.add(createSession(i));
        }

        return list;
    }

    private Session createSession(int i) throws IOException {
        Session session = new Session();
        Handler handler = new SubjectHandler();

        session.setId(i + 1);
        session.setList(handler.read(generateFileName(i)));

        return session;
    }

    private String generateFileName(int i) {
        return "session" + (i + 1) + ".txt";
    }

    public void write(List<Session> list) {
        for (Session session : list) {
            System.out.println(session);
        }
    }

}
