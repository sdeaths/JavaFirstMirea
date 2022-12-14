package ru.mirea.task20;

import java.util.Date;
import java.util.Scanner;

public class Developer {
    static void Coder()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию разработчика: ");
        String name = sc.nextLine();
        Date start_time = new Date();
        start_time.setDate(1);
        start_time.setMonth(9);
        start_time.setHours(15);
        start_time.setMinutes(15);
        int mounth = new Date().getMonth() + 1;
        System.out.println( name + '\n' + "Задание получено: " + start_time.getDate() + "." + start_time.getMonth() + " " + start_time.getHours() + ":" + start_time.getMinutes());
        System.out.println("Задание сдано:    " + new Date().getDate() + "." + mounth + " " + new Date().getHours() + ":" + new Date().getMinutes());
    }

    public static void main(String[] args)
    {
        Coder();
    }
}
