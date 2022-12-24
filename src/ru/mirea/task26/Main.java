package ru.mirea.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int menu = -1;
    System.out.println("Оформление заказа");
    System.out.println("Выберете способ оплаты");
    System.out.println("1 - Электронный кошелек");
    System.out.println("2 - Кредитная карта");
    Scanner sc = new Scanner(System.in);
    while (menu != 0)
    {
        System.out.print("Введите число: ");
        menu = sc.nextInt();
        switch (menu){
            case 1:
                Payment epayment = new EPayment();
                epayment.askData();
                break;
            case 2:
                Payment cardpayment = new Card();
                cardpayment.askData();
                break;
        }
    }
}
}
