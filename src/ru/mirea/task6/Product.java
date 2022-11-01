package ru.mirea.task6;

public class Product implements Priceable{
    private String type;
    private double price;
    Product(String type, double price){
        this.price = price;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    @Override
    public double getPrice(){
        return price;
    }
}
