package ru.mirea.task10;

import java.util.Scanner;

public class Num6 {
    public static boolean isProst(int n, int div){
        if (n == div)
            return true;
        if (n%div == 0)
            return false;
        return isProst(n, div+1);
    }

    public static void main (String args[]){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = isProst(num, 2);
        System.out.println(answer);
    }
}
