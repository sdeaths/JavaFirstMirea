package ru.mirea.task8.task3;

import javax.swing.*;
import java.lang.*;
public class Main extends JFrame{
    Main() throws InterruptedException {
        JFrame frame = new JFrame("Animation");
        frame.setSize(500,800);
        JLabel picture = new JLabel("", JLabel.CENTER);
        frame.add(picture);
        frame.setVisible(true);
        while (true){
            picture.setIcon(new ImageIcon("C:\\Users\\s_death_s\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\task3\\1step.jpg"));
            Thread.sleep(150);
            picture.setIcon(new ImageIcon("C:\\Users\\s_death_s\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\task3\\2step.jpg"));
            Thread.sleep(150);
            picture.setIcon((new ImageIcon("C:\\Users\\s_death_s\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\task3\\3step.jpg")));
            Thread.sleep(150);
        }
    }

    public static void main(String []args) throws InterruptedException
    {
        new Main();
    }
}
