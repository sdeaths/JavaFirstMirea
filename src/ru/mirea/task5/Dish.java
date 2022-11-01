package ru.mirea.task5;

public abstract class Dish {
    protected double volume;
    protected String type;
    protected String color;

    public double getVolume() {
        return volume;
    }

    public String getType(){
        return type;
    }

    public String getColor() {
        return color;
    }

    public abstract void Info();
}
