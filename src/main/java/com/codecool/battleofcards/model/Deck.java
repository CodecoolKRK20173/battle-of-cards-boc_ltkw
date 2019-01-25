package com.codecool.battleofcards.model;

import java.util.List;

import com.codecool.battleofcards.dao.Dao;

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