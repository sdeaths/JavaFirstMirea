package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class AppendInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        try(FileWriter writer = new FileWriter("src/ru/mirea/task15/info1.txt", true)) {
            System.out.println("Введите информацию, которую необходимо дописать в текстовый файл");
            text = scanner.nextLine();
            writer.write(" " + text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
