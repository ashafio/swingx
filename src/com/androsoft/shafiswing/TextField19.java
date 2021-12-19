package com.androsoft.shafiswing;

import javax.swing.*;
import java.awt.*;

public class TextField19 extends JFrame {

    private Container c;
    private JLabel userLabel,passLabel;
    private JTextField tf1,tf2;

    TextField19()
    {
        initial_components();
    }

    public void initial_components() {
        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);

        userLabel = new JLabel();
        userLabel.setText("username");
        userLabel.setBounds(50,50,180,120);
        c.add(userLabel);

        passLabel = new JLabel("Enter Password: ");
        passLabel.setBounds(50,190,180,120);
        c.add(passLabel);

        tf1 = new JTextField("Enter Firstname");
        tf1.setBounds(50,300,200,50);
        c.add(tf1);

        tf2 = new JTextField("Enter Lastname");
        tf2.setOpaque(true);
        tf2.setBackground(Color.green);
        tf2.setBounds(50,400,200,50);
        c.add(tf2);

    }

    public static void main(String[] args) {
        TextField19 f = new TextField19();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(350,50,500,500);
        f.setTitle("eHospital");

    }




}

