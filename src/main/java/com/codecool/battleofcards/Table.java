package com.codecool.battleofcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Table {

    private Player playerOne;
    private Player playerTwo;
    private Deck deck;
    private List<Card> drawedCards;
    private List<Card> currentlyPlayedCards;

    public Table() {
        playerOne = new Player();
        playerTwo = new Player();
        drawedCards = new ArrayList<Card>();
        currentlyPlayedCards = new ArrayList<Card>();

    }

    public int compareStats(Card playerOneCard, Card playerTwoCard, StatEnum stat) {
        StatComparator comparator = new StatComparator();
        switch (stat) {
            case Attack:
                return comparator.compare(playerOneCard.getAttack(), playerTwoCard.getAttack());
            case Defense:
                return comparator.compare(playerOneCard.getdefense(), playerTwoCard.getdefense());
            case Hp:
                return comparator.compare(playerOneCard.getHp(), playerTwoCard.getHp());
            case Speed:
                return comparator.compare(playerOneCard.getSpeed(), playerTwoCard.getSpeed());
            default:
                return 0;
                

        }
    }
}