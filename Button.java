        JButton rightButton = new JButton("Get category");
        rightButton.setPreferredSize(new Dimension(150,30));
        rightButton.setFont(new Font("Inter",Font.PLAIN, 15));
        rightButton.setFocusable(false);
        rightButton.setFocusPainted(false);
        // rightButton.setBorderPainted(false);
        rightButton.setBackground(new Color(24,160,251));
        rightButton.setForeground(Color.WHITE);
        rightButton.setBorder(BorderFactory.createEmptyBorder());
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == rightButton){
                    String firstrightcard = rightfirstTextfield.getText();
                    String secondrightcard = rightsecondTextfield.getText();
                    String thirdrightcard = rightthirdTextfield.getText();
                    String fourthrightcard = rightfourthTextfield.getText();
                    String fifthrightcard = rightfifthTextfield.getText();
                    String[] rightDeck = {firstrightcard, secondrightcard, thirdrightcard, fourthrightcard, fifthrightcard};
                    outerloop: // nested loop break
                    for (int i = 0; i < rightDeck.length; i++){
                        for (int j = i+1; j < rightDeck.length; j++){
                            // Check if the inputs are cards
                            if ((!rightDeck[i].matches("[2-9JQKA][HDCS]") && !rightDeck[i].matches("10[HDCS]"))
                            || (!rightDeck[j].matches("[2-9JQKA][HDCS]") && !rightDeck[j].matches("10[HDCS]"))){
                                JOptionPane.showMessageDialog(null, "Invalid card! Enter again.", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                                break outerloop;
                            }
                            // Check for enough inputs
                            else if (rightDeck[i].equals("")||rightDeck[j].equals("")){
                                JOptionPane.showMessageDialog(null, "Not enough cards! Enter again.", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                                break outerloop;
                            }
                            // Check for duplicates
                            else if (rightDeck[i].equals(rightDeck[j])){
                                JOptionPane.showMessageDialog(null, "Hand has duplicate cards! Enter again.", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
                                break outerloop;
                            }
                        }
                    }
                    for (int i = 0; i < rightDeck.length; i++){
                        System.out.println(rightDeck[i]);
                    }
                }
            }
        });
        fifthrightPanel.add(rightButton);
