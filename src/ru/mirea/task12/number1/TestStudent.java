package ru.mirea.task12.number1;
import java.util.Scanner;

public class TestStudent {
    public static void sort(int[] a) {
        for (int left = 0; left < 5; left++) {
            int value = a[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < a[i])
                    a[i + 1] = a[i];
                else
                    break;
            }
            a[i + 1] = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        int[] iDNumber = new int[5];
        System.out.println("Введите id 5 студентов");
        for (int i = 0; i<5; i++) {
            s[i] = new Student();
            s[i].id = sc.nextInt();
            iDNumber[i] = s[i].id;
        }
        System.out.println("Массив до сортировки: ");
        for (int i=0; i<5; i++)
            System.out.println(s[i].toString());
        System.out.println("Массив после сортировки: ");
        sort(iDNumber);
        for (int i=0; i<5; i++) {
            s[i].id = iDNumber[i];
            System.out.println(s[i].toString());
        }
    }
}
