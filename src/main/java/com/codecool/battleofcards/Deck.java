package com.codecool.battleofcards;

import java.util.ArrayList;
import java.util.List;

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