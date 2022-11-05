package ru.mirea.task2.opt4;
import java.util.Scanner;

public class testDog {
    private static void addDogs(Dog []dogs, int amount) {
        Scanner sc = new Scanner(System.in);
        Dog dog;
        String name;
        int age;
        for (int i = 0; i < amount; i++) {
            System.out.println("Введите имя собаки");
            name = sc.next();
            System.out.println("Введите возраст собаки");
            age = sc.nextInt();
            dog = new Dog(name, age);
            dogs[i] = dog;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество собак");
        int amount = sc.nextInt();
        Dog[] dogs = new Dog[amount];
        addDogs(dogs, amount);
        System.out.println("Введите номер собаки");
        int num = sc.nextInt() - 1;
        System.out.println(dogs[num].toString());
        dogs[num].intoHumanAge();
    }
}
