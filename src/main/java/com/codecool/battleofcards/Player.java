package com.codecool.battleofcards;

import java.util.List;
import java.util.ArrayList;

public class Player {

    private List<Card> cards;

    public Player() {
        this.cards = new ArrayList<Card>();
    }

    public Card getTopCard() {
        return cards.get(0);
    }

    public void deleteCard(Card cardToDelete) {
        cards.remove(cardToDelete);
    }

    public void addCardToTheBottom(Card cardToAdd) {
        cards.add(cardToAdd);
    }

    public boolean checkIfEmpty() {
        if (cards.size() > 0) {
            return false;
        }
        return true;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}