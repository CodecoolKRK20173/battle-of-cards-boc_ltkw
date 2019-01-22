package com.codecool.battleofcards;

import java.util.Comparator;

public class AttackComparator implements Comparator<Card> {

    //@Override
    public int compare(Card playerOneCard, Card playerTwoCard) {;
        return (playerOneCard.getAttack() - playerTwoCard.getAttack());
    }
}