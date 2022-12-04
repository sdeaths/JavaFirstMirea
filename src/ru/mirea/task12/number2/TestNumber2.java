package ru.mirea.task12.number2;
import java.util.Scanner;

public class TestNumber2 {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имена студентов: ");
        for (int i=0; i<4; i++) {
            s[i] = new Student();
            s[i].s = sc.nextLine();
        }
        System.out.println("Введите оценки студентов: ");
        for (int i=0; i<s.length; i++)
            s[i].mark = sc.nextInt();
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.Sort(s, 0, s.length - 1);
        for (int i=0; i<4; i++) {
            System.out.println(s[i].getS() + " " + s[i].getMark());
        }
    }
}
