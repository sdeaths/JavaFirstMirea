package ru.mirea.task5;

public class DogTest {
    public static void main(String[] args){
        Poodle poodle = new Poodle("Snuf", "white", 7);
        poodle.Info();
        System.out.println(poodle.name + " голос!");
        poodle.Bark();
        Sheepdog sheepdog = new Sheepdog("Тузик", "Коричневый", 10);
        System.out.println(sheepdog.name + " голос!");
        sheepdog.Bark();
        sheepdog.Info();
    }
}
