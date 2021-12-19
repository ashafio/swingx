package com.androsoft.shafiswing;

import javax.swing.*;
import java.awt.*;
public class MultiPassLabel13 extends JFrame {

    private Container c;
    private JLabel userLabel,passLabel;

    MultiPassLabel13()
    {
        initial_components();
    }

    public void initial_components() {
        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);
        userLabel = new JLabel();
        userLabel.setText("username");
        //userLabel.setToolTipText("Enter Username");
        userLabel.setBounds(50,50,180,120);
        c.add(userLabel);


        passLabel = new JLabel("Enter Password: ");
        // passLabel.setText("Password");
        //userLabel.setToolTipText("Enter Username");
        passLabel.setBounds(50,190,180,120);

        c.add(passLabel);


    }

    public static void main(String[] args) {
        MultiPassLabel13 f = new MultiPassLabel13();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(350,350,500,500);
        f.setTitle("eHospital");

    }




}
