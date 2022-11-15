package ru.mirea.task8.task2;

import javax.swing.*;

public class Main1 extends JFrame{

    Main1(String s)
    {
        setSize(600,500);
        JLabel jLabel = new JLabel("", JLabel.CENTER);
        ImageIcon imageIcon = new ImageIcon(s);
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        new Main1(args[0]);
    }
}
