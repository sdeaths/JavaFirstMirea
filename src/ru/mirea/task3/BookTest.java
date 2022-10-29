package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book();
        System.out.println(book.toString());
        book.setAuthor("Михаил Афанасьевич Булгаков");
        book.setName("Мастер и Маргарита");
        book.setYear(1966);
        book.setPages(416);
        System.out.println(book.toString());
    }
}
