package ru.mirea.task8.task1;

import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
    boolean f = false;
    Main(){
        super("Task1");
        setLayout(null);
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        setBackground(Color.white);
        if(!f){
            for(int i = 0; i < 20; i++){
                int x = 100+(int)(Math.random()*500);
                int y = 100+(int)(Math.random()*500);
                int a =(int)(Math.random()*2);
                Shape shape = switch (a) {
                    case 0: shape = new Rect(x,y);
                    case 1: shape = new Circle(x, y);
                    default: shape = new RoundRect(x,y);
                };
                shape.paintFigure(g);
            }
            f = true;
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
