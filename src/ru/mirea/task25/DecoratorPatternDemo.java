package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        redCircle.setRedBorder();
        System.out.println("--------------");
        Shape rectangle = new Rectangle();
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.setRedBorder();
        redRectangle.draw();
    }
}
