package com.codecool.battleofcards.controller;

import java.util.ArrayList;
import java.util.List;

import com.codecool.battleofcards.model.Card;

public class Player {

    private List<Card> cards;
    private String playerName;

    public Player() {
        this.cards = new ArrayList<Card>();
    }

    public Card getTopCard() {
        return cards.get(0);
    }

    public Card getTopCardAndRemoveIt() {
        Card topCard = getTopCard();
        cards.remove(0);
        return topCard;
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

    public List<Card> getCards() {
        return cards;
    }

    public void addListOfCardsToBottom(List<Card> cardsToAdd) {
        for(int i = 0; i < cardsToAdd.size(); i++) {
            cards.add(cardsToAdd.get(i));
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }
}