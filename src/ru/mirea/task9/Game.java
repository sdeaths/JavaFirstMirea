package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Матч");
        frame.setSize(500,350);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton cskButton = new JButton("ЦСК");
        cskButton.setBounds(100,180,85,25);
        frame.add(cskButton);

        JButton dinamoButton = new JButton("ДИНАМО");
        dinamoButton.setBounds(300,180,100,25);
        frame.add(dinamoButton);

        final int[] cskScore = {0};
        final int[] dinamoScore = {0};
        JLabel scoreLabel = new JLabel("Result: " + cskScore[0] + " x " + dinamoScore[0]);
        scoreLabel.setSize(200, 100);
        scoreLabel.setBounds(210, 100, 85, 25);
        frame.add(scoreLabel);

        JLabel lastGoalLabel = new JLabel("Last scorer: ");
        lastGoalLabel.setSize(200, 100);
        lastGoalLabel.setBounds(200, 120, 150, 25);
        frame.add(lastGoalLabel);

        JLabel winnerLabel = new JLabel("Winner: ");
        winnerLabel.setSize(200, 100);
        winnerLabel.setBounds(220, 50, 100, 25);
        frame.add(winnerLabel);

        cskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cskScore[0]+=1;
                if (cskScore[0] > 9){
                    winnerLabel.setText("Winner: ЦСК");
                }
                else {
                    scoreLabel.setText("Result: " + cskScore[0] + " x " + dinamoScore[0]);
                    lastGoalLabel.setText("Last scorer: ЦСК");
                }
            }
        });

        dinamoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinamoScore[0]+=1;
                if (dinamoScore[0] > 9){
                    winnerLabel.setText("Winner: ДИНАМО");
                }
                else {
                    scoreLabel.setText("Result: " + cskScore[0] + " x " + dinamoScore[0]);
                    lastGoalLabel.setText("Last scorer: ДИНАМО");
                }
            }
        });
    }
}
