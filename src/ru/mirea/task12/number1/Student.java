package ru.mirea.task12.number1;

public class Student {
    String student = "Student number: ";
    int id;

    @Override
    public String toString(){
        return student + id;
    }
}
