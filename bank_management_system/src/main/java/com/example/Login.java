package com.example;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame{
    Login(){

        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);

        /*ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("logo.png"));
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon customIcon = new ImageIcon(image);
        JLabel label = new JLabel(customIcon);
        label.setBounds(70,10,100,100);
        add(label);*/

        JLabel welcomeText = new JLabel( "Welcome to ATM");
        welcomeText.setBounds(200, 40, 10, 40);
        add(welcomeText);

        getContentPane().setBackground(Color.WHITE);

        setSize(400, 400);
        setVisible(true);
        setLocation(350,200);
    }

    public static void main(String[] args) {
        new Login();
    }
    
}
