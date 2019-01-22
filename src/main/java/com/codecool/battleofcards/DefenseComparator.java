package com.codecool.battleofcards;

import java.util.Comparator;

public class DefenseComparator implements Comparator<Card> {

    //@Override
    public int compare(Card playerOneCard, Card playerTwoCard) {
        return (playerOneCard.getdefense() - playerTwoCard.getdefense());
    }
}