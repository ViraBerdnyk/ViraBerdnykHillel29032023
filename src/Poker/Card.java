package Poker;

public class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        if (!isValidSuit(suit) || !isValidRank(rank)) {
            throw new InvalidCardException("Invalid card: " + rank + " of " + suit);
        }
        this.suit = suit;
        this.rank = rank;
    }

    private boolean isValidSuit(String suit) {
        String[] validSuits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        for (String validSuit : validSuits) {
            if (validSuit.equals(suit)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidRank(String rank) {
        String[] validRanks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for (String validRank : validRanks) {
            if (validRank.equals(rank)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
