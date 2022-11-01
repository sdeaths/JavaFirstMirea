package ru.mirea.task5;

public class Teapot extends Dish{
    public Teapot(String color, double volume){
        type = "Чайник";
        this.color = color;
        this.volume = volume;
    }
    @Override
    public void Info(){
        System.out.println("Тип: " + type + "; цвет: " + color + "; объем: " + volume + "\n");
    }
}
