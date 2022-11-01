package ru.mirea.task5;

public class DishTest {
    public static void main(String[] args){
        Plate plate = new Plate("yellow", 0.3);
        plate.Info();
        Teapot teapot = new Teapot("silver", 3);
        teapot.Info();
    }
}
