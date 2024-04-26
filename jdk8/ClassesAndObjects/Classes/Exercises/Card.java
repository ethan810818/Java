package ClassesAndObjects.Classes.Exercises;

import Constants.Constants.Rank;
import Constants.Constants.Suit;

public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank(){
        return rank;
    }

    public int getSuit(){
        return suit;
    }

    public static boolean isValidRank(int rank) {
        return Rank.ACE <= rank && rank <= Rank.KING;
    }

    public static boolean isValidSuit(int suit) {
        return Suit.HEARTS <= suit && suit <= Suit.SPADES;
    }

    public String rankToString(int rank) {
        switch (rank) {
            case Rank.ACE:
                return "Ace";
            case Rank.DEUCE:
                return "Deuce";
            case Rank.THREE:
                return "Three";
            case Rank.FOUR:
                return "Four";
            case Rank.FIVE:
                return "Five";
            case Rank.SIX:
                return "Six";
            case Rank.SEVEN:
                return "Seven";
            case Rank.EIGHT:
                return "Eight";
            case Rank.NINE:
                return "Nine";
            case Rank.TEN:
                return "Ten";
            case Rank.JACK:
                return "Jack";
            case Rank.QUEEN:
                return "Queen";
            case Rank.KING:
                return "King";

            default:
                return null;
        }
    }

    public String suitToString(int suit) {
        switch (suit) {
            case Suit.HEARTS:
                return "Hearts";
            case Suit.DIAMONDS:
                return "Diamonds";
            case Suit.CLUBS:
                return "Clubs";
            case Suit.SPADES:
                return "Spades";
        
            default:
                return null;
        }
    }

}
