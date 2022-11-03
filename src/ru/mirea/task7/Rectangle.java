package ru.mirea.task7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        width = length = 0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width * length);
    }
    @Override
    public String toString(){
        return "width: " + width + ", length: " + length + ", color: " + color + ", filled: " + isFilled();
    }
}
