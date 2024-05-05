
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.jar.JarEntry;

public class test {
    public static void main(String[] args) {
        int width = 1280;
        int height = 720;
        ImageIcon titleIcon = new ImageIcon("game_logo.jpg");
        JButton compareButton = new JButton();
        // compareButton.setPreferredSize(new Dimension(200,90));
        compareButton.setBorder(BorderFactory.createEtchedBorder());
        compareButton.setText("Compare Hands");
        compareButton.setFont(new Font("Inter", Font.BOLD, 15));
        int buttonWidth = 80;
        int buttonHeight = 20;
        compareButton.setBounds(
                new Rectangle((width - buttonWidth) / 2, (height - buttonHeight) / 2, buttonWidth, buttonHeight));
        compareButton.setSize(new Dimension(buttonWidth, buttonHeight));
        compareButton.setFocusable(false);
        // JPanel leftPanel = new JPanel();
        // leftPanel.setBackground(Color.BLUE);
        // leftPanel.add(compareButton);

        // * Start from here
        // Label for hand 1
        JLabel leftLabel = new JLabel();
        leftLabel.setText("Hand 1");
        leftLabel.setFont(new Font("Inter", Font.BOLD, 15));
        leftLabel.setHorizontalTextPosition(JLabel.CENTER);
        leftLabel.setForeground(Color.WHITE);

        // Label for hand 2
        JLabel rightLabel = new JLabel();
        rightLabel.setText("Hand 2");
        rightLabel.setFont(new Font("Inter", Font.BOLD, 15));
        rightLabel.setHorizontalTextPosition(JLabel.CENTER);
        rightLabel.setForeground(Color.WHITE);

        // Create Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(Color.BLUE);
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.RED);
        leftPanel.setPreferredSize(new Dimension(575, 575));
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBackground(Color.CYAN);
        rightPanel.setPreferredSize(new Dimension(575, 575));
        JPanel topleftPanel = new JPanel(new GridBagLayout());
        topleftPanel.setPreferredSize(new Dimension(100, 100));
        topleftPanel.setBackground(Color.BLACK);
        JPanel toprightPanel = new JPanel(new GridBagLayout());
        toprightPanel.setPreferredSize(new Dimension(100, 100));
        toprightPanel.setBackground(Color.BLACK);
        // GridBagConstraints constraints = new GridBagConstraints();

        JPanel secondleftPanel = new JPanel(new BorderLayout());
        secondleftPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topsecondleftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        topsecondleftPanel.setPreferredSize(new Dimension(100, 100));
        topsecondleftPanel.setBackground(Color.BLACK);

        JPanel thirdleftPanel = new JPanel(new BorderLayout());
        thirdleftPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topthirdleftPanel = new JPanel();
        topthirdleftPanel.setPreferredSize(new Dimension(300, 300));
        topthirdleftPanel.setBackground(Color.BLACK);

        JPanel fourthleftPanel = new JPanel(new BorderLayout());
        fourthleftPanel.setPreferredSize(new Dimension(50, 50));
        JPanel topfourthleftPanel = new JPanel();
        topfourthleftPanel.setPreferredSize(new Dimension(50, 50));
        topfourthleftPanel.setBackground(Color.BLACK);

        JPanel fifthleftPanel = new JPanel();
        fifthleftPanel.setPreferredSize(new Dimension(100, 100));
        fifthleftPanel.setBackground(Color.BLACK);

        // Create right Panels
        JPanel secondrightPanel = new JPanel(new BorderLayout());
        secondrightPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topsecondrightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        topsecondrightPanel.setPreferredSize(new Dimension(100, 100));
        topsecondrightPanel.setBackground(Color.BLACK);

        JPanel thirdrightPanel = new JPanel(new BorderLayout());
        thirdrightPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topthirdrightPanel = new JPanel();
        topthirdrightPanel.setPreferredSize(new Dimension(300, 300));
        topthirdrightPanel.setBackground(Color.BLACK);

        JPanel fourthrightPanel = new JPanel(new BorderLayout());
        fourthrightPanel.setPreferredSize(new Dimension(50, 50));
        JPanel topfourthrightPanel = new JPanel();
        topfourthrightPanel.setPreferredSize(new Dimension(50, 50));
        topfourthrightPanel.setBackground(Color.BLACK);

        JPanel fifthrightPanel = new JPanel();
        fifthrightPanel.setPreferredSize(new Dimension(100, 100));
        fifthrightPanel.setBackground(Color.BLACK);

        // Create Text Field Left side
        JTextField leftfirstTextfield = new JTextField();
        leftfirstTextfield.setPreferredSize(new Dimension(50, 20));
        leftfirstTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftfirstTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField leftsecondTextfield = new JTextField();
        leftsecondTextfield.setPreferredSize(new Dimension(50, 20));
        leftsecondTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftsecondTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField leftthirdTextfield = new JTextField();
        leftthirdTextfield.setPreferredSize(new Dimension(50, 20));
        leftthirdTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftthirdTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField leftfourthTextfield = new JTextField();
        leftfourthTextfield.setPreferredSize(new Dimension(50, 20));
        leftfourthTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftfourthTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField leftfifthTextfield = new JTextField();
        leftfifthTextfield.setPreferredSize(new Dimension(50, 20));
        leftfifthTextfield.setBorder(BorderFactory.createEmptyBorder());
        leftfifthTextfield.setHorizontalAlignment(JTextField.CENTER);

        // Create Text Field Right side
        JTextField rightfirstTextfield = new JTextField();
        rightfirstTextfield.setPreferredSize(new Dimension(50, 20));
        rightfirstTextfield.setBorder(BorderFactory.createEmptyBorder());
        rightfirstTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField rightsecondTextfield = new JTextField();
        rightsecondTextfield.setPreferredSize(new Dimension(50, 20));
        rightsecondTextfield.setBorder(BorderFactory.createEmptyBorder());
        rightsecondTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField rightthirdTextfield = new JTextField();
        rightthirdTextfield.setPreferredSize(new Dimension(50, 20));
        rightthirdTextfield.setBorder(BorderFactory.createEmptyBorder());
        rightthirdTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField rightfourthTextfield = new JTextField();
        rightfourthTextfield.setPreferredSize(new Dimension(50, 20));
        rightfourthTextfield.setBorder(BorderFactory.createEmptyBorder());
        rightfourthTextfield.setHorizontalAlignment(JTextField.CENTER);

        JTextField rightfifthTextfield = new JTextField();
        rightfifthTextfield.setPreferredSize(new Dimension(50, 20));
        rightfifthTextfield.setBorder(BorderFactory.createEmptyBorder());
        rightfifthTextfield.setHorizontalAlignment(JTextField.CENTER);

        // Get input through ENTER and the cursor jumps to the next Text field left side
        leftfirstTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    leftsecondTextfield.requestFocusInWindow();
                }
            }
        });

        leftsecondTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    leftthirdTextfield.requestFocusInWindow();
                }
            }
        });

        leftthirdTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    leftfourthTextfield.requestFocusInWindow();
                }
            }
        });

        leftfourthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    leftfifthTextfield.requestFocusInWindow();
                }
            }
        });

        // Get input through ENTER and the cursor jumps to the next Text field right
        // side
        rightfirstTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    rightsecondTextfield.requestFocusInWindow();
                }
            }
        });

        rightsecondTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    rightthirdTextfield.requestFocusInWindow();
                }
            }
        });

        rightthirdTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    rightfourthTextfield.requestFocusInWindow();
                }
            }
        });

        rightfourthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    rightfifthTextfield.requestFocusInWindow();
                }
            }
        });

        // Create Button left side
        JButton leftButton = new JButton("Get category");
        leftButton.setPreferredSize(new Dimension(150, 30));
        leftButton.setFont(new Font("Inter", Font.PLAIN, 15));
        leftButton.setFocusable(false);
        leftButton.setFocusPainted(false);
        // leftButton.setBorderPainted(false);
        leftButton.setBackground(new Color(24, 160, 251));
        leftButton.setForeground(Color.WHITE);
        leftButton.setBorder(BorderFactory.createEmptyBorder());
        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == leftButton) {
                    String firstleftcard = leftfirstTextfield.getText();
                    String secondleftcard = leftsecondTextfield.getText();
                    String thirdleftcard = leftthirdTextfield.getText();
                    String fourthleftcard = leftfourthTextfield.getText();
                    String fifthleftcard = leftfifthTextfield.getText();
                    String[] leftDeck = { firstleftcard, secondleftcard, thirdleftcard, fourthleftcard, fifthleftcard };
                    Poker_hand_hw2 left_hand = new Poker_hand_hw2(leftDeck);
                    System.out.println(left_hand.get_category_strings());
                }
            }
        });
        fifthleftPanel.add(leftButton);

        // Create Button right side
        JButton rightButton = new JButton("Get category");
        rightButton.setPreferredSize(new Dimension(150, 30));
        rightButton.setFont(new Font("Inter", Font.PLAIN, 15));
        rightButton.setFocusable(false);
        rightButton.setFocusPainted(false);
        // rightButton.setBorderPainted(false);
        rightButton.setBackground(new Color(24, 160, 251));
        rightButton.setForeground(Color.WHITE);
        rightButton.setBorder(BorderFactory.createEmptyBorder());
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == rightButton) {
                    String firstrightcard = rightfirstTextfield.getText();
                    String secondrightcard = rightsecondTextfield.getText();
                    String thirdrightcard = rightthirdTextfield.getText();
                    String fourthrightcard = rightfourthTextfield.getText();
                    String fifthrightcard = rightfifthTextfield.getText();
                    String[] rightDeck = { firstrightcard, secondrightcard, thirdrightcard, fourthrightcard,
                            fifthrightcard };
                    Poker_hand_hw2 right_hand = new Poker_hand_hw2(rightDeck);
                    outerloop: // nested loop break
                    for (int i = 0; i < rightDeck.length; i++) {
                        for (int j = i + 1; j < rightDeck.length; j++) {
                            // Check if the inputs are cards
                            if ((!rightDeck[i].matches("[2-9JQKA][HDCS]") && !rightDeck[i].matches("10[HDCS]"))
                                    || (!rightDeck[j].matches("[2-9JQKA][HDCS]")
                                            && !rightDeck[j].matches("10[HDCS]"))) {
                                JOptionPane.showMessageDialog(null, "Invalid card! Enter again.", "Invalid Input",
                                        JOptionPane.INFORMATION_MESSAGE);
                                break outerloop;
                            }
                            // Check for enough inputs
                            else if (rightDeck[i].equals("") || rightDeck[j].equals("")) {
                                JOptionPane.showMessageDialog(null, "Not enough cards! Enter again.", "Invalid Input",
                                        JOptionPane.INFORMATION_MESSAGE);
                                break outerloop;
                            }
                            // Check for duplicates
                            else if (rightDeck[i].equals(rightDeck[j])) {
                                JOptionPane.showMessageDialog(null, "Hand has duplicate cards! Enter again.",
                                        "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                                break outerloop;
                            } else {
                                System.out.println(right_hand.get_category_strings());
                            }
                        }
                    }
                }
            }
        });
        fifthrightPanel.add(rightButton);

        // Create GUI frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Poker Game");
        frame.setSize(1280, 720);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setIconImage(titleIcon.getImage());
        // frame.setLayout(new GridBagLayout());
        // frame.add(compareButton, new GridBagConstraints());
        frame.setLocationRelativeTo(null);

        // Adding components into the frame
        frame.add(mainPanel);
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);
        leftPanel.add(topleftPanel, BorderLayout.NORTH);
        rightPanel.add(toprightPanel, BorderLayout.NORTH);
        topleftPanel.add(leftLabel);
        toprightPanel.add(rightLabel);
        leftPanel.add(secondleftPanel);
        secondleftPanel.add(topsecondleftPanel, BorderLayout.NORTH);
        secondleftPanel.add(thirdleftPanel);
        thirdleftPanel.add(topthirdleftPanel, BorderLayout.NORTH);
        thirdleftPanel.add(fourthleftPanel);
        fourthleftPanel.add(topfourthleftPanel, BorderLayout.NORTH);
        fourthleftPanel.add(fifthleftPanel);

        rightPanel.add(secondrightPanel);
        secondrightPanel.add(topsecondrightPanel, BorderLayout.NORTH);
        secondrightPanel.add(thirdrightPanel);
        thirdrightPanel.add(topthirdrightPanel, BorderLayout.NORTH);
        thirdrightPanel.add(fourthrightPanel);
        fourthrightPanel.add(topfourthrightPanel, BorderLayout.NORTH);
        fourthrightPanel.add(fifthrightPanel);

        topsecondleftPanel.add(leftfirstTextfield);
        topsecondleftPanel.add(leftsecondTextfield);
        topsecondleftPanel.add(leftthirdTextfield);
        topsecondleftPanel.add(leftfourthTextfield);
        topsecondleftPanel.add(leftfifthTextfield);

        topsecondrightPanel.add(rightfirstTextfield);
        topsecondrightPanel.add(rightsecondTextfield);
        topsecondrightPanel.add(rightthirdTextfield);
        topsecondrightPanel.add(rightfourthTextfield);
        topsecondrightPanel.add(rightfifthTextfield);
    }
}
