package ClassesAndObjects.Classes.Exercises;

import Constants.Constants.Rank;
import Constants.Constants.Suit;

public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Suit.HEARTS; suit <= Suit.SPADES; suit++) {
            for (int rank = Rank.ACE; rank <= Rank.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                card.rankToString(card.getRank()),
                card.suitToString(card.getSuit()));
            }
        }
    }
}
