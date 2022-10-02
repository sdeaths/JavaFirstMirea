package ru.mirea.task2.opt2;

public class Ball {
    private String color;
    private int diameter;

    public Ball(String c, int h) {
        color = c;
        diameter = h;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public String getColor() {
        return color;
    }
    public int getDiameter() {
        return diameter;
    }
    public String toString() {
        return "Мяч " + this.color+ " и диаметром "+this.diameter+" см";
    }
}
