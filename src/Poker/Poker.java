package Poker;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        for (int i = 1; i <= 4; i++) {
            System.out.print("Player" + i + "hand: ");
            for (int j = 1; j <= 5; j++) {
                System.out.print(deck.draw() + ", ");
            }
            System.out.println();
        }

    }
}
