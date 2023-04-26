package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Ten", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));

            }
        }
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.size() < 1) {
            return null;
        }
        return cards.remove(0);
    }
}
