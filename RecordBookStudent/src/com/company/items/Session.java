package com.company.items;

import java.util.List;

/**
 * Created by Олег on 29.09.2016.
 */
public class Session {
    private int id;
    private List<Subject> list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Subject> getList() {
        return list;
    }

    public void setList(List<Subject> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Session " + id + "\n");
        for (Subject subject : list) {
            stringBuffer.append(subject).append("\n");
        }
        return stringBuffer.toString();
    }
}
