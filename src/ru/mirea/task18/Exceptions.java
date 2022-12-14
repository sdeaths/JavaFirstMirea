package ru.mirea.task18;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args)
    {
        String FIO, INN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        FIO = scanner.nextLine();
        System.out.print("Введите номер ИНН: ");
        INN = scanner.next();
        try
        {
            Integer.parseInt(INN);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ошибка, введен недействительный ИНН: " + e.getMessage());
        }
    }
}
