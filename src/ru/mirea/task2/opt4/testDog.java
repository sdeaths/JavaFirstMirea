package ru.mirea.task2.opt4;
import java.util.ArrayList;
import java.util.Scanner;

public class testDog {
    private static void addDogs(ArrayList dogList, int amount) {
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
            dogList.add(dog);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Dog> dogList = new ArrayList<>();
        System.out.println("Введите количество собак");
        int amount = sc.nextInt();
        addDogs(dogList, amount);
        System.out.println("Введите номер собаки");
        int num = sc.nextInt() - 1;
        System.out.println(dogList.get(num).toString());
        dogList.get(num).intoHumanAge();
    }


}
