package com.androsoft.shafiswing;

        import javax.swing.*;
        import java.awt.*;

public class Jswing15and15 extends JFrame {

    private Container c;
    private JLabel userLabel,passLabel;
    private Font font;

    Jswing15and15()
    {
        initial_components();
    }

    public void initial_components() {


        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);

        font = new Font("monospace",Font.ITALIC,20);

        userLabel = new JLabel();
        userLabel.setText("username");
        //userLabel.setToolTipText("Enter Username");
        userLabel.setBounds(50,50,280,120);
        userLabel.setFont(font);

        //************
        // 15
        //************
        userLabel.setForeground(Color.RED);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.green);

        //************
        // 16
        //************
        userLabel.setToolTipText("Enter your username!!!!");

        c.add(userLabel);


        passLabel = new JLabel("Enter Password: ");
        // passLabel.setText("Password");
        //userLabel.setToolTipText("Enter Username");
        passLabel.setBounds(50,190,280,120);
        passLabel.setFont(font);
        c.add(passLabel);


    }

    public static void main(String[] args) {
        Jswing15and15 f = new Jswing15and15();
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(350,350,500,500);
        f.setTitle("eHospital");

    }




}

