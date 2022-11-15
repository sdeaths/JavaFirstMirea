package ru.mirea.task8.task1;

import java.awt.*;
public class Circle extends Shape{
    public Circle(int x, int y){
        super(x,y);
    }

    @Override
    public void paintFigure(Graphics gr) {
        r=(int)(Math.random()*255);
        g=(int)(Math.random()*255);
        b=(int)(Math.random()*255);
        gr.setColor(new Color(r,g,b));
        int width=50+(int)(Math.random()*100);
        int length=50+(int)(Math.random()*100);
        gr.drawOval(x, y, width, length);
    }

}
