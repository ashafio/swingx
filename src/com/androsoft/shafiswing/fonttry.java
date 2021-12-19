package com.androsoft.shafiswing;

import javax.swing.*;
import java.awt.*;

public class fonttry extends JFrame {

    private Container c;
    private JLabel userLabel,passLabel;
/* *************************
    H
    e
    r
    e
    ************************
 */
    private Font font;

    fonttry()
    {
        initial_components();
    }

    public void initial_components() {


        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);

        font = new Font("monospace",Font.ITALIC,20); //**************** here

        userLabel = new JLabel();
        userLabel.setText("username");
        //userLabel.setToolTipText("Enter Username");
        userLabel.setBounds(50,50,280,120);
        userLabel.setFont(font);  //******************* Here
        c.add(userLabel);


        passLabel = new JLabel("Enter Password: ");
        // passLabel.setText("Password");
        //userLabel.setToolTipText("Enter Username");
        passLabel.setBounds(50,190,280,120);
        passLabel.setFont(font);   //******************* Here
        c.add(passLabel);


    }

    public static void main(String[] args) {
        fonttry f = new fonttry();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(350,350,500,500);
        f.setTitle("eHospital");

    }




}

