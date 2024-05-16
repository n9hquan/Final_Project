import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Poker_Game {
    private static ImageIcon resizeImage(ImageIcon originalIcon, int width, int height) {
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public static void main(String[] args) {

        ImageIcon titleIcon = new ImageIcon("Poker_Practice_Game\\lib\\game_logo.jpg");

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

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalGlue());
        centerPanel.setBackground(Color.BLACK);
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

        JPanel secondleftPanel = new JPanel(new BorderLayout());
        secondleftPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topsecondleftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 40));
        topsecondleftPanel.setPreferredSize(new Dimension(100, 100));
        topsecondleftPanel.setBackground(Color.BLACK);

        JPanel thirdleftPanel = new JPanel(new BorderLayout());
        thirdleftPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topthirdleftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 70));
        topthirdleftPanel.setPreferredSize(new Dimension(300, 300));
        topthirdleftPanel.setBackground(Color.BLACK);

        JPanel fourthleftPanel = new JPanel(new BorderLayout());
        fourthleftPanel.setPreferredSize(new Dimension(80, 80));
        JPanel topfourthleftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        topfourthleftPanel.setPreferredSize(new Dimension(80, 80));
        topfourthleftPanel.setBackground(Color.BLACK);

        JPanel fifthleftPanel = new JPanel();
        fifthleftPanel.setPreferredSize(new Dimension(100, 100));
        fifthleftPanel.setBackground(Color.BLACK);

        // Create right Panels
        JPanel secondrightPanel = new JPanel(new BorderLayout());
        secondrightPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topsecondrightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 40));
        topsecondrightPanel.setPreferredSize(new Dimension(100, 100));
        topsecondrightPanel.setBackground(Color.BLACK);

        JPanel thirdrightPanel = new JPanel(new BorderLayout());
        thirdrightPanel.setPreferredSize(new Dimension(100, 100));
        JPanel topthirdrightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 70));
        topthirdrightPanel.setPreferredSize(new Dimension(300, 300));
        topthirdrightPanel.setBackground(Color.BLACK);

        JPanel fourthrightPanel = new JPanel(new BorderLayout());
        fourthrightPanel.setPreferredSize(new Dimension(80, 80));
        JPanel topfourthrightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        topfourthrightPanel.setPreferredSize(new Dimension(80, 80));
        topfourthrightPanel.setBackground(Color.BLACK);

        JPanel fifthrightPanel = new JPanel();
        fifthrightPanel.setPreferredSize(new Dimension(100, 100));
        fifthrightPanel.setBackground(Color.BLACK);

        // Create Left side Cardholders
        ImageIcon card_placeholder = new ImageIcon("Poker_Practice_Game\\lib\\52_cards\\card_placeholder.png");
        ImageIcon resizedIcon = resizeImage(card_placeholder, 100, 140);
        JLabel leftfirstLabel = new JLabel(resizedIcon);
        leftfirstLabel.setPreferredSize(new Dimension(100, 140));
        JLabel leftsecondLabel = new JLabel(resizedIcon);
        leftsecondLabel.setPreferredSize(new Dimension(100, 140));
        JLabel leftthirdLabel = new JLabel(resizedIcon);
        leftthirdLabel.setPreferredSize(new Dimension(100, 140));
        JLabel leftfourthLabel = new JLabel(resizedIcon);
        leftfourthLabel.setPreferredSize(new Dimension(100, 140));
        JLabel leftfifthLabel = new JLabel(resizedIcon);
        leftfifthLabel.setPreferredSize(new Dimension(100, 140));

        // Create Right side Cardholders
        JLabel rightfirstLabel = new JLabel(resizedIcon);
        leftfirstLabel.setPreferredSize(new Dimension(100, 140));
        JLabel rightsecondLabel = new JLabel(resizedIcon);
        leftsecondLabel.setPreferredSize(new Dimension(100, 140));
        JLabel rightthirdLabel = new JLabel(resizedIcon);
        leftthirdLabel.setPreferredSize(new Dimension(100, 140));
        JLabel rightfourthLabel = new JLabel(resizedIcon);
        leftfourthLabel.setPreferredSize(new Dimension(100, 140));
        JLabel rightfifthLabel = new JLabel(resizedIcon);
        leftfifthLabel.setPreferredSize(new Dimension(100, 140));

        // Information box for check category left
        JLabel leftCheckCategory = new JLabel();
        leftCheckCategory.setPreferredSize(new Dimension(500, 40));
        leftCheckCategory.setOpaque(true);
        leftCheckCategory.setBorder(BorderFactory.createEtchedBorder());
        leftCheckCategory.setBackground(new Color(196, 196, 196));
        leftCheckCategory.setForeground(Color.BLACK);
        leftCheckCategory.setHorizontalAlignment(JLabel.CENTER);
        leftCheckCategory.setFont(new Font("Inter", Font.BOLD, 15));

        // Information box for check category right
        JLabel rightCheckCategory = new JLabel();
        rightCheckCategory.setPreferredSize(new Dimension(500, 40));
        rightCheckCategory.setOpaque(true);
        rightCheckCategory.setBorder(BorderFactory.createEtchedBorder());
        rightCheckCategory.setBackground(new Color(196, 196, 196));
        rightCheckCategory.setForeground(Color.BLACK);
        rightCheckCategory.setHorizontalAlignment(JLabel.CENTER);
        rightCheckCategory.setFont(new Font("Inter", Font.BOLD, 15));

        // Compare Hands button
        JButton compareButton = new JButton("Compare");
        compareButton.setPreferredSize(new Dimension(80, 30));
        compareButton.setMaximumSize(compareButton.getPreferredSize());
        compareButton.setFont(new Font("Inter", Font.PLAIN, 15));
        compareButton.setFocusable(false);
        compareButton.setFocusPainted(false);
        compareButton.setBackground(new Color(24, 160, 251));
        compareButton.setForeground(Color.WHITE);
        compareButton.setBorder(BorderFactory.createEmptyBorder());
        compareButton.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        // Information box for comparing 2 hands
        JLabel compareHandsBox = new JLabel();
        compareHandsBox.setPreferredSize(new Dimension(150, 60));
        compareHandsBox.setMaximumSize(compareHandsBox.getPreferredSize());
        compareHandsBox.setOpaque(true);
        compareHandsBox.setBorder(BorderFactory.createEtchedBorder());
        compareHandsBox.setBackground(new Color(196, 196, 196));
        compareHandsBox.setForeground(Color.BLACK);
        compareHandsBox.setHorizontalAlignment(JLabel.CENTER);
        compareHandsBox.setVerticalAlignment(JLabel.CENTER);
        compareHandsBox.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        compareHandsBox.setFont(new Font("Inter", Font.BOLD, 15));

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
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        //
                        ImageIcon firstCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + leftfirstTextfield.getText().toUpperCase().trim() + ".png");
                        if (firstCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            leftCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            leftfirstLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon firstIcon = resizeImage(firstCard, 100, 140);
                            leftfirstLabel.setIcon(firstIcon);
                            leftsecondTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        leftsecondTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon secondCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + leftsecondTextfield.getText().toUpperCase().trim() + ".png");
                        if (secondCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            leftCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            leftsecondLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon secondIcon = resizeImage(secondCard, 100, 140);
                            leftsecondLabel.setIcon(secondIcon);
                            leftthirdTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        leftthirdTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon thirdCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + leftthirdTextfield.getText().toUpperCase().trim() + ".png");
                        if (thirdCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            leftCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            leftthirdLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon thirdIcon = resizeImage(thirdCard, 100, 140);
                            leftthirdLabel.setIcon(thirdIcon);
                            leftfourthTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        leftfourthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon fourthCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + leftfourthTextfield.getText().toUpperCase().trim() + ".png");
                        if (fourthCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            leftCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            leftfourthLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon fourthIcon = resizeImage(fourthCard, 100, 140);
                            leftfourthLabel.setIcon(fourthIcon);
                            leftfifthTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        leftfifthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon fifthCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + leftfifthTextfield.getText().toUpperCase().trim() + ".png");
                        if (fifthCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            leftCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            leftfifthLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon fifthIcon = resizeImage(fifthCard, 100, 140);
                            leftfifthLabel.setIcon(fifthIcon);
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Get input through ENTER and the cursor jumps to the next Text field right
        // side
        rightfirstTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon sixthCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + rightfirstTextfield.getText().toUpperCase().trim() + ".png");
                        if (sixthCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            rightCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            rightfirstLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon sixthIcon = resizeImage(sixthCard, 100, 140);
                            rightfirstLabel.setIcon(sixthIcon);
                            rightsecondTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        rightsecondTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon seventhCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + rightsecondTextfield.getText().toUpperCase().trim() + ".png");
                        if (seventhCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            rightCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            rightsecondLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon seventhIcon = resizeImage(seventhCard, 100, 140);
                            rightsecondLabel.setIcon(seventhIcon);
                            rightthirdTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        rightthirdTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon eighthCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + rightthirdTextfield.getText().toUpperCase().trim() + ".png");
                        if (eighthCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            rightCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            rightthirdLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon eighthIcon = resizeImage(eighthCard, 100, 140);
                            rightthirdLabel.setIcon(eighthIcon);
                            rightfourthTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        rightfourthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon ninthCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + rightfourthTextfield.getText().toUpperCase().trim() + ".png");
                        if (ninthCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            rightCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            rightfourthLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon ninthIcon = resizeImage(ninthCard, 100, 140);
                            rightfourthLabel.setIcon(ninthIcon);
                            rightfifthTextfield.requestFocusInWindow();
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        rightfifthTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                    try {
                        ImageIcon tenthCard = new ImageIcon(
                                "Poker_Practice_Game\\lib\\52_cards\\"
                                        + rightfifthTextfield.getText().toUpperCase().trim() + ".png");
                        if (tenthCard.getImageLoadStatus() != MediaTracker.COMPLETE) {
                            rightCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Card image not found!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            rightfifthLabel.setIcon(resizedIcon);
                        } else {
                            ImageIcon tenthIcon = resizeImage(tenthCard, 100, 140);
                            rightfifthLabel.setIcon(tenthIcon);
                        }
                    } catch (Exception E) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + E.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
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
                    String firstleftcard = leftfirstTextfield.getText().toUpperCase().trim();
                    String secondleftcard = leftsecondTextfield.getText().toUpperCase().trim();
                    String thirdleftcard = leftthirdTextfield.getText().toUpperCase().trim();
                    String fourthleftcard = leftfourthTextfield.getText().toUpperCase().trim();
                    String fifthleftcard = leftfifthTextfield.getText().toUpperCase().trim();
                    String[] leftDeck = { firstleftcard, secondleftcard, thirdleftcard, fourthleftcard, fifthleftcard };
                    boolean isValid = true;
                    for (String card : leftDeck) {
                        if (!(card.matches("[2-9JQKA][HDCS]") || card.matches("10[HDCS]"))) {
                            leftCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Missing card information!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid){
                        outerloop: // nested loop break
                        for (int i = 0; i < leftDeck.length; i++) {
                            for (int j = i + 1; j < leftDeck.length; j++) {
                                // Check for duplicates
                                if (leftDeck[i].equals(leftDeck[j])) {
                                    JOptionPane.showMessageDialog(null, "Hand has duplicate cards! Enter again.",
                                            "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                                    isValid = false;
                                    break outerloop;
                                }
                            }
                        }
                    }
                    if (isValid) {
                        Poker_hand_hw2 left_hand = new Poker_hand_hw2(leftDeck);
                        leftCheckCategory.setText(left_hand.get_category_strings());
                    }
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
                    String firstrightcard = rightfirstTextfield.getText().toUpperCase().trim();
                    String secondrightcard = rightsecondTextfield.getText().toUpperCase().trim();
                    String thirdrightcard = rightthirdTextfield.getText().toUpperCase().trim();
                    String fourthrightcard = rightfourthTextfield.getText().toUpperCase().trim();
                    String fifthrightcard = rightfifthTextfield.getText().toUpperCase().trim();
                    String[] rightDeck = { firstrightcard, secondrightcard, thirdrightcard, fourthrightcard,
                            fifthrightcard };
                    // Check if enough inputs or valid card information
                    boolean isValid = true;
                    for (String card : rightDeck) {
                        if (!(card.matches("[2-9JQKA][HDCS]") || card.matches("10[HDCS]"))) {
                            rightCheckCategory.setText(null);
                            JOptionPane.showMessageDialog(null, "Missing card information!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid){
                        outerloop: // nested loop break
                        for (int i = 0; i < rightDeck.length; i++) {
                            for (int j = i + 1; j <rightDeck.length; j++) {
                                // Check for duplicates
                                if (rightDeck[i].equals(rightDeck[j])) {
                                    JOptionPane.showMessageDialog(null, "Hand has duplicate cards! Enter again.",
                                            "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                                    isValid = false;
                                    break outerloop;
                                }
                            }
                        }
                    }
                    if (isValid) {
                        Poker_hand_hw2 right_hand = new Poker_hand_hw2(rightDeck);
                        rightCheckCategory.setText(right_hand.get_category_strings());
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
        mainPanel.add(centerPanel, BorderLayout.CENTER);
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

        topthirdleftPanel.add(leftfirstLabel);
        topthirdleftPanel.add(leftsecondLabel);
        topthirdleftPanel.add(leftthirdLabel);
        topthirdleftPanel.add(leftfourthLabel);
        topthirdleftPanel.add(leftfifthLabel);

        topthirdrightPanel.add(rightfirstLabel);
        topthirdrightPanel.add(rightsecondLabel);
        topthirdrightPanel.add(rightthirdLabel);
        topthirdrightPanel.add(rightfourthLabel);
        topthirdrightPanel.add(rightfifthLabel);

        topfourthleftPanel.add(leftCheckCategory);
        topfourthrightPanel.add(rightCheckCategory);
        centerPanel.add(compareHandsBox);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centerPanel.add(compareButton);
        centerPanel.add(Box.createVerticalGlue());
        centerPanel.revalidate();

        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String leftCategory = leftCheckCategory.getText();
                String rightCategory = rightCheckCategory.getText();
                if (leftCategory.isEmpty() || rightCategory.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Both hands must be categorized before comparing.",
                            "Incomplete Data", JOptionPane.ERROR_MESSAGE);
                } else {
                    String firstleftcard = leftfirstTextfield.getText().toUpperCase().trim();
                    String secondleftcard = leftsecondTextfield.getText().toUpperCase().trim();
                    String thirdleftcard = leftthirdTextfield.getText().toUpperCase().trim();
                    String fourthleftcard = leftfourthTextfield.getText().toUpperCase().trim();
                    String fifthleftcard = leftfifthTextfield.getText().toUpperCase().trim();
                    String[] leftDeck = { firstleftcard, secondleftcard, thirdleftcard, fourthleftcard, fifthleftcard };
                    Poker_hand_hw2 left_hand = new Poker_hand_hw2(leftDeck);
                    String firstrightcard = rightfirstTextfield.getText().toUpperCase().trim();
                    String secondrightcard = rightsecondTextfield.getText().toUpperCase().trim();
                    String thirdrightcard = rightthirdTextfield.getText().toUpperCase().trim();
                    String fourthrightcard = rightfourthTextfield.getText().toUpperCase().trim();
                    String fifthrightcard = rightfifthTextfield.getText().toUpperCase().trim();
                    String[] rightDeck = { firstrightcard, secondrightcard, thirdrightcard, fourthrightcard,
                            fifthrightcard };
                    Poker_hand_hw2 right_hand = new Poker_hand_hw2(rightDeck);
                    // Compare
                    int output = left_hand.compare_to(right_hand);
                    if (output == 1) {
                        compareHandsBox.setText("<html>is ranked<br/>higher than</html>");
                    } else if (output == -1) {
                        compareHandsBox.setText("<html>is ranked<br/>lower than</html>");
                    } else {
                        compareHandsBox.setText("<html>is ranked<br/>equal to</html>");
                    }
                }
            }
        });
    }
}
