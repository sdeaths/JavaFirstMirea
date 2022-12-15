package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] territoryInfo = {"В России 16 городов-миллионеров", "В Индии 46 городов-миллионеров", "В Японии 12 городов-миллионеров"};
        String[] resourcesInfo = {"В России ВВП 1,83 трлн. долларов", "В Индии ВВП 2,66 трлн. долларов", "В Японии ВВП 5,91 трлн. долларов"};
        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитет"};

        CurrencyInfo currencyInfo = new CurrencyInfo(territoryInfo, resourcesInfo, diplomacyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("src\\ru\\mirea\\task29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(currencyInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("src\\ru\\mirea\\task29\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(currencyInfo1);
    }
}
