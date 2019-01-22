package com.codecool.battleofcards;

import java.util.Comparator;

public class HpComparator implements Comparator<Card> {

    @Override
    public int compare(Card playerOneCard, Card playerTwoCard) {
        return (playerOneCard.getHp() - playerTwoCard.getHp());
    }
}