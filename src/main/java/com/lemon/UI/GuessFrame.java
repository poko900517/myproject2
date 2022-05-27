package com.lemon.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    //Fields
    //Construtors
    public GuessFrame() {
        super();
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("hi");
        JLabel label = new JLabel("Hello!!");
        button.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hi");
                label.setText("Hello!");
            }
        }));
        //JLabel label = new JLabel("Zzzzz....");
        setLayout(new FlowLayout());
        add(label);
        add(button);
        setVisible(true);
    }


    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
       /* guessFrame.setSize(600,400);
        guessFrame.setVisible(true);*/
        }
       }