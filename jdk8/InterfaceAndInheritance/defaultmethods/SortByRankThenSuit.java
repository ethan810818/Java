package InterfaceAndInheritance.defaultmethods;

import java.util.*;

public class SortByRankThenSuit implements Comparator<Card> {
    public int compare(Card firstCard, Card secondCard) {
        int comVal = 
            firstCard.getRank().value() - secondCard.getRank().value();
        if (comVal != 0) 
            return comVal;
        else
            return firstCard.getSuit().value() - secondCard.getSuit().value();
    }
}
