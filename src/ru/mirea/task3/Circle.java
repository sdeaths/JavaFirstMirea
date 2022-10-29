package ru.mirea.task3;

public class Circle {
    private double radius;
    Circle() {
        radius = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getSquare(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getCircumferenceLenght(){
        return 2*Math.PI * radius;
    }
}
