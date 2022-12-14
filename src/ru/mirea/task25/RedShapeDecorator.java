package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void setRedBorder() {

        System.out.println("Red border");
    }

    public void draw() {
        shape.draw();
    }
}
