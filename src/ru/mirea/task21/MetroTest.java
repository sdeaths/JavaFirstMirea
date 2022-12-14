package ru.mirea.task21;

public class MetroTest {
    public static void main(String[] args){
        Metro lines = new Metro();
        System.out.println("Uneven stations => ");
        lines.PrintList(true);
        System.out.println("Even stations => ");
        lines.PrintList(false);
    }
}
