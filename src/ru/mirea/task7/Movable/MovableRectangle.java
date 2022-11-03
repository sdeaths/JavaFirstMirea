package ru.mirea.task7.Movable;

public class MovableRectangle implements Movable{
    private MovablePoint dot1;
    private MovablePoint dot2;
    public MovableRectangle(int x, int y, int xSpeed, int ySpeed){
        dot1 = new MovablePoint(x, y, xSpeed, ySpeed);
        dot2 = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveUp(){
        dot1.moveUp();
        dot2.moveUp();
    }
    @Override
    public void moveDown(){
        dot1.moveDown();
        dot2.moveDown();
    }
    @Override
    public void moveLeft(){
        dot1.moveLeft();
        dot2.moveLeft();
    }
    @Override
    public void moveRight(){
        dot1.moveRight();
        dot2.moveRight();
    }
    @Override
    public String toString(){
        return "MovableRectangle\n" + "dot1 = (" + dot1.toString() + "), dot2 = (" + dot2.toString() + ")";
    }
}
