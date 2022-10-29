package ru.mirea.task4;
import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args){
        System.out.print("Введите имя автора: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Введите email автора: ");
        String email = in.nextLine();
        System.out.print("Введите пол автора: ");
        char gender = in.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println(author.getName() + " " + author.getGender() + " " + author.getEmail());
        System.out.print("Введите новый email автора: ");
        in.nextLine();
        email = in.nextLine();
        author.setEmail(email);
        System.out.println(author.toString());
    }
}
