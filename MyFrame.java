package Final_Project;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
    ImageIcon titleIcon = new ImageIcon("game_logo.jpg");
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Poker Game");
        this.setSize(1280, 720);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        this.setIconImage(titleIcon.getImage());
        this.setLayout(null);
        this.add(new Panel());
        this.add(new Panel2());
    }
}
