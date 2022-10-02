package ru.mirea.task2.opt3;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String c, String a, int h) {
        name = c;
        author = a;
        year = h;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }
    public String toString() {
        return this.name+ " написал "+this.author+" в " + this.year;
    }
}
