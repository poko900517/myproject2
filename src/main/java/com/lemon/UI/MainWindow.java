package com.lemon.UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interface(GUI)
        //swing, JavaFX
        //extension
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("ok");
        //匿名類別 Annoymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world!");
            }
        });
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("Testing"));

        //Layout
        frame.setVisible(true);
        System.out.println("END?");
    }
}
