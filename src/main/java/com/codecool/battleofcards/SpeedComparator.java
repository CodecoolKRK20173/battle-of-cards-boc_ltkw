package com.codecool.battleofcards;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Card> {

    //@Override
    public int compare(Card playerOneCard, Card playerTwoCard) {
        return (playerOneCard.getSpeed() - playerTwoCard.getSpeed());
    }
}