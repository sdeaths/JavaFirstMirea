package ru.mirea.task4;

public class Ball {
    private double x;
    private double y;

    Ball(){
        x = y = 0;
    }
    Ball (double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    @Override
    public String toString() {
        return "Ball:" + '\n' + "x=" + x + '\n' + "y=" + y;
    }
}
