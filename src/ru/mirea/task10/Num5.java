package ru.mirea.task10;

import java.util.Scanner;

public class Num5 {
    public static int sum(int n){
        if ( n/10 == 0 ){
            return n;
        }
        return n%10 + sum (n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр числа: " + sum(n));
    }
}
