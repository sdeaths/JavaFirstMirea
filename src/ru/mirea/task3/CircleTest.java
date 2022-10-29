package ru.mirea.task3;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Circle\nSquare: " + circle.getSquare() + "\nCircumference lenght: " + circle.getCircumferenceLenght() + "\nRadius: " + circle.getRadius());
    }
}
