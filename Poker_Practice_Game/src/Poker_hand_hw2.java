// package Homework.Homework1_2;
// package com.gradescope.cs201;

public class Poker_hand_hw2 {

    private int[] cardsNum = new int[5];
    private int[] cardsSuit = new int[5];
    private String[] parts = new String[2];

    public Poker_hand_hw2(String[] cards) {
        if (cards.length != 5) {
            throw new IllegalArgumentException();
        }
        for (String card : cards) {
            if (!card.matches("[2-9JQKA][HDCS]") && !card.matches("10[HDCS]")) {
                throw new IllegalArgumentException("Invalid card");
            }
        }
        int tmp = 0;
        int temp;
        for (String card : cards) {
            parts = card.split("(?=[HDCS])");
            if (!parts[0].equals("J") && !parts[0].equals("Q") && !parts[0].equals("K") && !parts[0].equals("A")) {
                cardsNum[tmp] = Integer.parseInt(parts[0]);
            } else if (parts[0].equals("J")) {
                cardsNum[tmp] = 11;
            } else if (parts[0].equals("Q")) {
                cardsNum[tmp] = 12;
            } else if (parts[0].equals("K")) {
                cardsNum[tmp] = 13;
            } else if (parts[0].equals("A")) {
                cardsNum[tmp] = 14;
            }
            if (parts[1].equals("H")) {
                cardsSuit[tmp] = 1;
            } else if (parts[1].equals("D")) {
                cardsSuit[tmp] = 2;
            } else if (parts[1].equals("C")) {
                cardsSuit[tmp] = 3;
            } else if (parts[1].equals("S")) {
                cardsSuit[tmp] = 4;
            }
            tmp++;
        }
        int temp2;
        boolean swapped = false;
        for (int i = 0; i < 4; i++) {
            swapped = false;
            for (int j = 0; j < 4 - i; j++) {
                if (cardsNum[j] > cardsNum[j + 1]) {
                    temp = cardsNum[j];
                    cardsNum[j] = cardsNum[j + 1];
                    cardsNum[j + 1] = temp;
                    temp2 = cardsSuit[j];
                    cardsSuit[j] = cardsSuit[j + 1];
                    cardsSuit[j + 1] = temp2;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

    }

    public String get_category() {
        // 9: Straight Flush
        if (cardsNum[0] == cardsNum[1] - 1 && cardsNum[1] == cardsNum[2] - 1 && cardsNum[2] == cardsNum[3] - 1
                && cardsNum[3] == cardsNum[4] - 1 && cardsSuit[0] == cardsSuit[1] && cardsSuit[1] == cardsSuit[2]
                && cardsSuit[2] == cardsSuit[3] && cardsSuit[3] == cardsSuit[4]) {
            return "Straight Flush";
        }
        // 8: Four of a kind
        else if (cardsNum[0] == cardsNum[1] && cardsNum[1] == cardsNum[2] && cardsNum[2] == cardsNum[3]
                || cardsNum[1] == cardsNum[2] && cardsNum[2] == cardsNum[3] && cardsNum[3] == cardsNum[4]) {
            return "Four of a kind";
        }
        // 7: Full house
        else if (cardsNum[0] == cardsNum[1] && cardsNum[1] == cardsNum[2] && cardsNum[3] == cardsNum[4]
                || cardsNum[0] == cardsNum[1] && cardsNum[2] == cardsNum[3] && cardsNum[3] == cardsNum[4]) {
            return "Full house";
        }
        // 6: Flush
        else if (cardsSuit[0] == cardsSuit[1] && cardsSuit[1] == cardsSuit[2] && cardsSuit[2] == cardsSuit[3]
                && cardsSuit[3] == cardsSuit[4]) {
            return "Flush";
        }
        // 5: Straight
        else if (cardsNum[0] == cardsNum[1] - 1 && cardsNum[1] == cardsNum[2] - 1 && cardsNum[2] == cardsNum[3] - 1
                && cardsNum[3] == cardsNum[4] - 1) {
            return "Straight";
        }
        // 4: Three of a kind
        else if (cardsNum[0] == cardsNum[1] && cardsNum[1] == cardsNum[2] || cardsNum[1] == cardsNum[2]
                && cardsNum[2] == cardsNum[3] || cardsNum[2] == cardsNum[3] && cardsNum[3] == cardsNum[4]) {
            return "Three of a kind";
        }
        // 3: Two pairs
        else if (cardsNum[0] == cardsNum[1] && cardsNum[2] == cardsNum[3] || cardsNum[0] == cardsNum[1]
                && cardsNum[3] == cardsNum[4] || cardsNum[1] == cardsNum[2] && cardsNum[3] == cardsNum[4]) {
            return "Two pairs";
        }
        // 2: One pair
        else if (cardsNum[0] == cardsNum[1] || cardsNum[1] == cardsNum[2] || cardsNum[2] == cardsNum[3]
                || cardsNum[3] == cardsNum[4]) {
            return "One pair";
        }
        // 1: High card
        else {
            String test = convert(cardsNum[4], cardsSuit[4]);
            return "High card: " + test;
        }

    }

    public String convert(int cardsNum, int cardSuit) {
        if (cardsNum < 11) {
            if (cardSuit == 1) {
                return String.valueOf(cardsNum) + "H";
            } else if (cardSuit == 2) {
                return String.valueOf(cardsNum) + "D";
            } else if (cardSuit == 3) {
                return String.valueOf(cardsNum) + "C";
            } else if (cardSuit == 4) {
                return String.valueOf(cardsNum) + "S";
            }
        } else if (cardsNum == 11) {
            if (cardSuit == 1) {
                return "JH";
            } else if (cardSuit == 2) {
                return "JD";
            } else if (cardSuit == 3) {
                return "JC";
            } else if (cardSuit == 4) {
                return "JS";
            }
        } else if (cardsNum == 12) {
            if (cardSuit == 1) {
                return "QH";
            } else if (cardSuit == 2) {
                return "QD";
            } else if (cardSuit == 3) {
                return "QC";
            } else if (cardSuit == 4) {
                return "QS";
            }
        } else if (cardsNum == 13) {
            if (cardSuit == 1) {
                return "KH";
            } else if (cardSuit == 2) {
                return "KD";
            } else if (cardSuit == 3) {
                return "KC";
            } else if (cardSuit == 4) {
                return "KS";
            }
        } else if (cardsNum == 14) {
            if (cardSuit == 1) {
                return "AH";
            } else if (cardSuit == 2) {
                return "AD";
            } else if (cardSuit == 3) {
                return "AC";
            } else if (cardSuit == 4) {
                return "AS";
            }
        }
        return "";
    }

    public int compare_to(Poker_hand_hw2 otherHand) {
        int get_category1 = this.get_category();
        int get_category2 = otherHand.get_category();
        int ans = 0;
        if (get_category1 > get_category2) {
            ans = 1;
        } else if (get_category1 < get_category2) {
            ans = -1;
        } else {
            // 9: Straight Flush
            if (get_category1 == 9) {
                if (this.cardsNum[4] > otherHand.cardsNum[4]) {
                    ans = 1;
                } else if (this.cardsNum[4] < otherHand.cardsNum[4]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 8: Four of a kind
            } else if (get_category1 == 8) {
                if (this.cardsNum[2] > otherHand.cardsNum[2]) {
                    ans = 1;
                } else if (this.cardsNum[2] < otherHand.cardsNum[2]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 7: Full house: consider the third card and (fourth and second)(triplet then
                // pairs)
            } else if (get_category1 == 7) {
                if (this.cardsNum[2] > otherHand.cardsNum[2]) {
                    ans = 1;
                } else if (this.cardsNum[2] < otherHand.cardsNum[2]) {
                    ans = -1;
                } else if (this.cardsNum[3] > otherHand.cardsNum[3] || this.cardsNum[1] > otherHand.cardsNum[1]) {
                    ans = 1;
                } else if (this.cardsNum[3] < otherHand.cardsNum[3] || this.cardsNum[1] < otherHand.cardsNum[1]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 6: Flush (rank like high card)
            } else if (get_category1 == 6) {
                if (this.cardsNum[4] > otherHand.cardsNum[4]) {
                    ans = 1;
                } else if (this.cardsNum[4] < otherHand.cardsNum[4]) {
                    ans = -1;
                } else if (this.cardsNum[3] > otherHand.cardsNum[3]) {
                    ans = 1;
                } else if (this.cardsNum[3] < otherHand.cardsNum[3]) {
                    ans = -1;
                } else if (this.cardsNum[2] > otherHand.cardsNum[2]) {
                    ans = 1;
                } else if (this.cardsNum[2] < otherHand.cardsNum[2]) {
                    ans = -1;
                } else if (this.cardsNum[1] > otherHand.cardsNum[1]) {
                    ans = 1;
                } else if (this.cardsNum[1] < otherHand.cardsNum[1]) {
                    ans = -1;
                } else if (this.cardsNum[0] > otherHand.cardsNum[0]) {
                    ans = 1;
                } else if (this.cardsNum[0] < otherHand.cardsNum[0]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 5: Straight
            } else if (get_category1 == 5) {
                if (this.cardsNum[4] > otherHand.cardsNum[4]) {
                    ans = 1;
                } else if (this.cardsNum[4] < otherHand.cardsNum[4]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 4: Three of a kind (rank the triplet first then the rest 2 cards)
            } else if (get_category1 == 4) {
                if (this.cardsNum[2] > otherHand.cardsNum[2]) {
                    ans = 1;
                } else if (this.cardsNum[2] < otherHand.cardsNum[2]) {
                    ans = -1;
                } else if (this.cardsNum[4] > otherHand.cardsNum[4] || this.cardsNum[1] > otherHand.cardsNum[1]) {
                    ans = 1;
                } else if (this.cardsNum[4] < otherHand.cardsNum[4] || this.cardsNum[1] < otherHand.cardsNum[1]) {
                    ans = -1;
                } else if (this.cardsNum[3] > otherHand.cardsNum[3] || this.cardsNum[0] > otherHand.cardsNum[0]) {
                    ans = 1;
                } else if (this.cardsNum[3] < otherHand.cardsNum[3] || this.cardsNum[0] < otherHand.cardsNum[0]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 3: Two pairs first highest pairs then lowest pairs then the rest card (add
                // together to compare)
            } else if (get_category1 == 3) {
                if (this.cardsNum[3] > otherHand.cardsNum[3]) {
                    ans = 1;
                } else if (this.cardsNum[3] < otherHand.cardsNum[3]) {
                    ans = -1;
                } else if (this.cardsNum[1] > otherHand.cardsNum[1]) {
                    ans = 1;
                } else if (this.cardsNum[1] < otherHand.cardsNum[1]) {
                    ans = -1;
                } else if (this.cardsNum[0] + this.cardsNum[1] + this.cardsNum[2] + this.cardsNum[3]
                        + this.cardsNum[4] > otherHand.cardsNum[0]
                                + otherHand.cardsNum[1] + otherHand.cardsNum[2] + otherHand.cardsNum[3]
                                + otherHand.cardsNum[4]) {
                    ans = 1;
                } else if (this.cardsNum[0]
                        + this.cardsNum[1] + this.cardsNum[2] + this.cardsNum[3]
                        + this.cardsNum[4] < otherHand.cardsNum[0]
                                + otherHand.cardsNum[1] + otherHand.cardsNum[2] + otherHand.cardsNum[3]
                                + otherHand.cardsNum[4]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
                // 2: One pair
            } else if (get_category1 == 2) {
                return compareOnePairs(this, otherHand);
            } else if (get_category1 == 1) {
                if (this.cardsNum[4] > otherHand.cardsNum[4]) {
                    ans = 1;
                } else if (this.cardsNum[4] < otherHand.cardsNum[4]) {
                    ans = -1;
                } else if (this.cardsNum[3] > otherHand.cardsNum[3]) {
                    ans = 1;
                } else if (this.cardsNum[3] < otherHand.cardsNum[3]) {
                    ans = -1;
                } else if (this.cardsNum[2] > otherHand.cardsNum[2]) {
                    ans = 1;
                } else if (this.cardsNum[2] < otherHand.cardsNum[2]) {
                    ans = -1;
                } else if (this.cardsNum[1] > otherHand.cardsNum[1]) {
                    ans = 1;
                } else if (this.cardsNum[1] < otherHand.cardsNum[1]) {
                    ans = -1;
                } else if (this.cardsNum[0] > otherHand.cardsNum[0]) {
                    ans = 1;
                } else if (this.cardsNum[0] < otherHand.cardsNum[0]) {
                    ans = -1;
                } else {
                    ans = 0;
                }
            }

        }
        return ans;
    }

    public int compareOnePairs(Poker_hand_hw2 a, Poker_hand_hw2 b) {
        // find the pair
        int pair1 = 0;
        int pair2 = 0;
        for (int i = 0; i < 4; i++) {
            if (a.cardsNum[i] == a.cardsNum[i + 1]) {
                pair1 = a.cardsNum[i];
            }
            if (b.cardsNum[i] == b.cardsNum[i + 1]) {
                pair2 = b.cardsNum[i];
            }
        }
        if (pair1 > pair2) {
            return 1;
        } else if (pair1 < pair2) {
            return -1;
        } else {
            return compareThreeLeftCards(a, b, pair1, pair2, 0, 0);
        }
    }

    public int compareThreeLeftCards(Poker_hand_hw2 a, Poker_hand_hw2 b, int pair1, int pair2, int highestThis,
            int highestOther) {
        // compare the rightmost card of each hand that is not in the pair
        int highestThis2 = 0;
        int highestOther2 = 0;
        for (int i = 0; i < 5; i++) {
            if (a.cardsNum[i] != pair1 && a.cardsNum[i] != highestThis) {
                highestThis2 = a.cardsNum[i];
            }
            if (b.cardsNum[i] != pair2 && b.cardsNum[i] != highestOther) {
                highestOther2 = b.cardsNum[i];
            }
        }
        if (highestThis2 == highestThis && highestOther2 == highestOther) {
            return 0;
        } else if (highestThis2 > highestOther2) {
            return 1;
        } else if (highestThis2 < highestOther2) {
            {
                return -1;
            }
        } else {
            return compareThreeLeftCards(a, b, pair1, pair2, highestThis2, highestOther2);
        }

    }
}
