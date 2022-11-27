package ru.mirea.task10;
import java.util.Scanner;
public class Num7 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberFactor(n, 2);
        System.out.println();
    }
    public static void printNumberFactor(int n, int div)
    {
        if (n == 1)
            return;
        if (n % div == 0)
        {
            System.out.print(div + " ");
            printNumberFactor(n/div, div);
        }
        else
        {
            printNumberFactor(n, div+1);
        }
    }
}
