package ClassesAndObjects.Classes.Exercises;

import Constants.Constants.Rank;
import Constants.Constants.Suit;

public class Deck {
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Suit.HEARTS; suit <= Suit.SPADES; suit++) {
            for (int rank = Rank.ACE; rank <= Rank.KING; rank++) {
                cards[suit - 1][rank - 1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit - 1][rank - 1];
    }

    public String createMethod() {
        String localVariable = "Hello World!";
        System.out.println(localVariable);
        return localVariable;
    }
}
