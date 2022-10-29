package ru.mirea.task4;

public class BallTest {
    public static void main(String[] args){
        Ball ball = new Ball();
        System.out.println(ball.toString());
        ball.setXY(1,5);
        System.out.println(ball.toString());
        ball.move(-2, 1);
        System.out.println(ball.toString());
    }
}
