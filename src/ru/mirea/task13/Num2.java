package ru.mirea.task13;

import java.util.*;

public class Num2 {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();

        //Добавление эл-ов в коллекцию
        names.add("Liza");
        names.add("Bob");
        names.add("Julia");
        names.add("Max");
        names.add("Kira");
        names.add("Jumeko");
        names.addLast("Koni");
        names.addFirst("Gleb");
        names.add(4, "Lexus");

        //подсчет эл-ов в коллекции
        System.out.println("В списке " + names.size() + " элементов");

        //Вывод эл-ов коллекции в консоль
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        //Установка элемента по индексу
        names.set(0, "Mika");

        System.out.println();

        //вывод элемента по индексу
        System.out.println(names.get(0));

        //проверка на наличие объекта в коллекции и вывод его индекса
        if (names.contains("Jumeko"))
            System.out.println("Список содержит объект Jumeko (#" + names.indexOf("Jumeko") +")");

        //удаление объектов
        names.remove("Julia");
        names.removeFirst();
        names.removeLast();
        //Вывод эл-ов коллекции в консоль
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));
    }
}
