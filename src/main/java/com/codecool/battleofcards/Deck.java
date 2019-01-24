package com.codecool.battleofcards;

import java.util.ArrayList;

public class Deck {

    private Dao dao = new Dao();
    private ArrayList<Card> cards;

    public Deck() {
        cards = dao.getCards();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}