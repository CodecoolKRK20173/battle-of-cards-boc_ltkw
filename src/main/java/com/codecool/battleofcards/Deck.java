package com.codecool.battleofcards;

import java.util.List;
import java.util.ArrayList;

public class Deck {

    private List<Card> cards;
    private Dao dao;

    public Deck() {
        cards = dao.getCards();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cardsToSet) {
        this.cards = cardsToSet;
    }
}