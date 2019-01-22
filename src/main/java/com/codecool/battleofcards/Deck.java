package com.codecool.battleofcards;

import java.util.List;

public class Deck {

    private Dao dao = new Dao();
    private List<Card> cards;

    public Deck() {
        cards = dao.getCards();
    }

    public List<Card> getCards() {
        return cards;
    }
}