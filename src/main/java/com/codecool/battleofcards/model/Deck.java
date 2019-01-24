package com.codecool.battleofcards.model;

import java.util.ArrayList;

import com.codecool.battleofcards.dao.Dao;

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