package com.codecool.battleofcards;

import java.util.List;
import java.util.ArrayList;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cardsToSet) {
        this.cards = cardsToSet;
    }
}