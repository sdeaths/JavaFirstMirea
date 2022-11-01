package ru.mirea.task6;

public class Animal implements Nameable{
    private String type;
    public Animal(String type){
        this.type = type;
    }
    @Override
    public String toString(){
        return "Animal: " + type;
    }
    @Override
    public String getName(){
        return type;
    }
}
