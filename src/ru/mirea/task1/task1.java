package ru.mirea.task1;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void printMas(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
    public static void sortMas(int[] mas){
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++){
                if (mas[i] > mas[i+1]){
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] mass = new int[] {12, 13, 14, 9, 4, 0, 2, 3, 5, 39};
        int menu = -1;
        while(menu != 0){
            System.out.println("\n1: Вывести сумму элементов массива используя цикл for\n2: Вывести сумму элементов массива используя цикл while\n3: Вывести сумму элементов массива используя цикл do while\n4: Вывод аргументов командной строки\n5: Вывод гармонического ряда\n6: Отсортировать рандомный массив\n7: Посчитать факториал числа\n0: Выход");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch(menu){
                case 1:{
                    int sum = 0;
                    for (int i = 0; i < mass.length; i++){
                        sum += mass[i];
                    }
                    System.out.println(sum);
                    break;
                }
                case 2:{
                    int sum = 0;
                    int i = 0;
                    while(i < mass.length){
                        sum += mass[i];
                        i++;
                    }
                    System.out.println(sum);
                    break;
                }
                case 3:{
                    int sum = 0;
                    int i = 0;
                    do{
                        sum += mass[i];
                        i++;
                    }while (i < mass.length);
                    System.out.println(sum);
                    break;
                }
                case 4:{
                    for (int i = 0; i < args.length; i++){
                        System.out.println(args[i]);
                    }
                    break;
                }
                case 5:{
                    DecimalFormat ft = new DecimalFormat("#.####");
                    for (int i = 1; i <= 10; i++){
                        System.out.print(ft.format(1./i) + " ");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Создание массива методом random()");
                    int[] randomMas = new int[10];
                    for (int i = 0; i < 10; i ++) {
                        int a = (int) (Math.random() * (50 + 1));
                        randomMas[i] = a;
                        System.out.print(randomMas[i] + " ");
                    }
                    sortMas(randomMas);
                    System.out.print("\nОтсортированный массив: ");
                    printMas(randomMas);
                    System.out.println("\nСоздание массива, используя класс Random");
                    Random rand = new Random();
                    for (int i = 0; i < 10; i ++) {
                        int a = rand.nextInt(60);
                        randomMas[i] = a;
                        System.out.print(randomMas[i] + " ");
                    }
                    sortMas(randomMas);
                    System.out.print("\nОтсортированный массив: ");
                    printMas(randomMas);
                    break;
                }
                case 7:{
                    System.out.print("Введите число, факториал которого надо посчитать: ");
                    int x = sc.nextInt();
                    int fac = 1;
                    for (int i = 1; i <= x; i++){
                        fac *= i;
                    }
                    System.out.println("Факториал равен: " + fac);
                    break;
                }
            }
        }
    }
}