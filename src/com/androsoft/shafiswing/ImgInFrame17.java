package com.androsoft.shafiswing;

import javax.swing.*;
import java.awt.*;

public class ImgInFrame17 extends JFrame {

    private Container c;
    private JLabel userLabel,passLabel;
    private Font font;
    //***********
    // HERE
    private JLabel imgLabel;
    private ImageIcon img;
    //***********


    ImgInFrame17()
    {
        initial_components();
    }

    public void initial_components() {


        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);

        font = new Font("monospace",Font.ITALIC,20);

        //***********
        // HERE
        img = new ImageIcon(getClass().getResource("MobilelyLove.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(450,300,img.getIconWidth(),img.getIconHeight());
        //imgLabel.setBounds(350,500,100,120);
        c.add(imgLabel);
        //***********



        userLabel = new JLabel();
        userLabel.setText("username");
        //userLabel.setToolTipText("Enter Username");
        userLabel.setBounds(50,50,180,80);
        userLabel.setFont(font);

        userLabel.setForeground(Color.RED);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.green);


        userLabel.setToolTipText("Enter your fucking username!!!!");

        c.add(userLabel);


        passLabel = new JLabel("Enter Password: ");
        passLabel.setBounds(50,190,280,120);
        passLabel.setFont(font);
        c.add(passLabel);


    }

    public static void main(String[] args) {
        ImgInFrame17 f = new ImgInFrame17();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(350,150,700,700);
        f.setTitle("eHospital");

    }




}


