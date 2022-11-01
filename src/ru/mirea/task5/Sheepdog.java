package ru.mirea.task5;

public class Sheepdog extends Dog{
    public Sheepdog(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    @Override
    public void Bark(){
        System.out.println("gaf gaf gaf");
    }
    public void Info(){
        System.out.println("Имя: " + name + "; цвет: " + color + "; вес: " + weight);
    }
}
