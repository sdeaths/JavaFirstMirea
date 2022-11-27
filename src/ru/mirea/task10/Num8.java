package ru.mirea.task10;
import java.util.Scanner;
public class Num8 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (palindrome(str, 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean palindrome(String str, int index)
    {
        if (index >= str.length()/2)
            return true;

        if (str.charAt(index) == str.charAt(str.length() - 1 - index))
            return palindrome(str, index + 1);

        return false;
    }
}
