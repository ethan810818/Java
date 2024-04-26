package ClassesAndObjects.Enums.Exercises;

import ClassesAndObjects.Enums.Rank;
import ClassesAndObjects.Enums.Suit;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public static boolean isValidRank(Rank rank) {
        return rank != null;
    }

    public static boolean isValidSuit(Suit suit) {
        return suit != null;
    }

    public String rankToString(Rank rank) {
        switch (rank) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";

            default:
                return null;
        }
    }

    public String suitToString(Suit suit) {
        switch (suit) {
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case SPADES:
                return "Spades";
        
            default:
                return null;
        }
    }
}
