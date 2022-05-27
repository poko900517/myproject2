package com.lemon.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    //Fields
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("ZZZZ");
    JTextField number = new JTextField(10);
    int secret = new Random().nextInt(10)+1;

    //Construtors
    public GuessFrame() {
        super();
        System.out.println("Secret: "+secret);
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        button.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hi");
                //label.setText("Hello!");
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num > secret) {
                    label.setText("Smaller");
                }else if(num < secret){
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo, the secret number is "+ secret);
                }
            }
        }));

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);

        setVisible(true);
    }


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
       /* guessFrame.setSize(600,400);
        guessFrame.setVisible(true);*/
        }
       }