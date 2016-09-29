package com.company.users;

/**
 * Created by Олег on 29.09.2016.
 */
public class Student {
    private String name;
    private String surname;
    private int groupNumber;
    //сюда если что даты заличэння
    private int personalBookNumber; //номер зачетки

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getPersonalBookNumber() {
        return personalBookNumber;
    }

    public void setPersonalBookNumber(int personalBookNumber) {
        this.personalBookNumber = personalBookNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", personalBookNumber=" + personalBookNumber +
                '}';
    }
}
