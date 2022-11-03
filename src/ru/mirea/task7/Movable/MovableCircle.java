package ru.mirea.task7.Movable;

public class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
    @Override
    public String toString(){
        return "MovableCircle\n" + "radius: " + radius + " center(" + center.toString() + ")";
    }
}
