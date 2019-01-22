package com.codecool.battleofcards;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private Dao dao;

    public Dealer() {

    }

    public void deal() {

    }

    public void shuffleCards() {
        Collections.shuffle(deck.getCards());
    }

    public void addCards() {
        deck.setCards(dao.getCards());
    }
}