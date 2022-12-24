package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Num1 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Угадайка");
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setLayout(null);

        final int[] tryes = {0};
        final int randomNumber = 0 + (int)(Math.random()*20);

        JLabel label = new JLabel("Угадай загаданное число");
        label.setSize(200, 100);
        label.setBounds(150, 100, 300, 25);
        frame.add(label);

        JTextField textField = new JTextField("");
        textField.setBounds(200,150,85,25);
        frame.add(textField);

        Button apply_button = new Button("Принять");
        apply_button.setBounds(200,180,95,25);
        frame.add(apply_button);
        apply_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!textField.getText().equals("")){
                    int user = Integer.parseInt(textField.getText());
                    if (user > randomNumber){
                        label.setText("Загаданное число меньше!");
                        tryes[0]++;
                    }
                    else if (user < randomNumber){
                        label.setText("Загаданное число больше!");
                        tryes[0]++;
                    }
                    else label.setText("Ты угадал! Число было " + randomNumber);

                    if (tryes[0] >= 3) label.setText("Game Over\n Число было " + randomNumber);
                }
            }
        });
    }
}
