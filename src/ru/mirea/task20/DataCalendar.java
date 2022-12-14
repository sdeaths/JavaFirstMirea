package ru.mirea.task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataCalendar {
    static void Date()
    {
        Scanner scanner = new Scanner(System.in);
        int year, month, date, hours, min;
        System.out.println("Работа с классом Date:");
        System.out.print("Введите год: ");
        year = scanner.nextInt();
        System.out.print("Введите месяц: ");
        month = scanner.nextInt();
        System.out.print("Введите дату: ");
        date = scanner.nextInt();
        System.out.print("Введите час: ");
        hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        min = scanner.nextInt();
        Date userDate = new Date();
        userDate.setYear(year - 1900);
        userDate.setMonth(month - 1);
        userDate.setDate(date);
        userDate.setHours(hours);
        userDate.setMinutes(min);
        System.out.println(userDate);
    }

    static void Calendar()
    {
        Scanner scanner = new Scanner(System.in);
        int year, month, date, hours, min;
        System.out.println("Работа с классом Calendar: ");
        System.out.print("Введите год: ");
        year = scanner.nextInt();
        System.out.print("Введите месяц: ");
        month = scanner.nextInt();
        System.out.print("Введите дату: ");
        date = scanner.nextInt();
        System.out.print("Введите час: ");
        hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        min = scanner.nextInt();
        Calendar calendar = new GregorianCalendar(year, month, date, hours, min);
        System.out.println("\tГод: " + calendar.get(Calendar.YEAR));
        System.out.println("\tМесяц: " + calendar.get(Calendar.MONTH));
        System.out.println("\tЧисло: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("\tЧасы: " + calendar.get(Calendar.HOUR));
        System.out.println("\tМинуты: " + calendar.get(Calendar.MINUTE));
    }

    public static void main(String[] args)
    {
        Date();
        Calendar();
    }
}
