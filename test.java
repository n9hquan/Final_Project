package Final_Project;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class test {
    public static void main(String[] args){
        JFrame myframe = new JFrame();
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        myframe.setTitle("Poker Game");
        myframe.setSize(1280, 720);
        myframe.getContentPane().setBackground(Color.BLUE);
        myframe.setLayout(null);
        JButton mybutton = new JButton();
        mybutton.setBounds(0,0,250,250);
        myframe.add(mybutton);
    }
}
