package ru.mirea.task3;

public class Book {
    private String author;
    private String name;
    private int year;
    private int pages;

    public Book(){
        author = name = "NULL";
        pages = 0;
        year = 0;
    }
    public Book(String author, String name, int year, int pages){
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getPages(){
        return pages;
    }
    @Override
    public String toString(){
        return "Book:\n" + "author: " + author + '\n' + "name: " + name + '\n' + "year: " + year + '\n' + "pages: " + pages;
    }
}
