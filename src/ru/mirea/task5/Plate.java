package ru.mirea.task5;

public class Plate extends Dish{
    public Plate(String color, double volume){
        type = "Тарелка";
        this.color = color;
        this.volume = volume;
    }
    @Override
    public void Info(){
        System.out.println("Тип: " + type + "; цвет: " + color + "; объем: " + volume + '\n');
    }
}
