package ru.mirea.task13;

import java.util.*;

public class Num1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        //Добавление эл-ов в коллекцию
        names.add("Liza");
        names.add("Bob");
        names.add("Julia");
        names.add("Max");
        names.add("Kira");
        names.add("Jumeko");

        //Вывод эл-ов коллекции в консоль
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        System.out.println("");

        //Установка эл-та по индексу
        names.set(1, "New name");
        System.out.println(names.get(1));

        //подсчет эл-ов в коллекции
        System.out.println("В списке " + names.size() + " элементов");

        //проверка на наличие объекта в коллекции и вывод его индекса
        if (names.contains("Liza"))
            System.out.println("Список содержит объект Liza (#" + names.indexOf("Liza") +")");

        //удаление объектов
        names.remove(4);
        names.remove("Max");

        System.out.println("");

        //Сортировка эл-ов
        Collections.sort(names);
        Collections.reverse(names);

        //Вывод эл-ов коллекции в консоль
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        System.out.println("");

        //перевод коллекции в массив
        Object[] name = names.toArray();
        for (int i = 0; i < name.length; i++)
            System.out.println(name[i]);
    }
}
