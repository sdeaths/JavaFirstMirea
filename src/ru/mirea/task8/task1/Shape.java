package ru.mirea.task8.task1;

import java.awt.*;

public abstract class Shape {
    protected int x,y,r,g,b;
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void paintFigure(Graphics gr);
}
