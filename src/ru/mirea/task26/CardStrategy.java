package ru.mirea.task26;

import java.util.Scanner;

public class CardStrategy implements PaymentStrategy{
    @Override
    public void askData(){
        System.out.println("Введите данные кредитной карты");
        Scanner sc = new Scanner(System.in);
        int number, year, month, cvv;
        System.out.print("Введите номер карты: ");
        number = sc.nextInt();
        System.out.println("-----Введите срок действия карты-----");
        System.out.print("Месяц: ");
        month = sc.nextInt();
        System.out.print("Год: ");
        year = sc.nextInt();
        System.out.print("Введите CVV: ");
        cvv = sc.nextInt();
        System.out.println("Введите \"ПОДТВЕРДИТЬ\", чтобы подтвердить покупку");
        String agreement = sc.next();
        if (agreement.equals("ПОДТВЕРДИТЬ"))
        {
            System.out.println("Заказ оформлен. Благодарим за покупку!");
        }
        else
        {
            System.out.println("Оплата не подтверждена!");
        }
    }
}
