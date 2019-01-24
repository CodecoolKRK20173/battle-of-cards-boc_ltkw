package com.codecool.battleofcards;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> cards;
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

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addListOfCardsToBottom(ArrayList<Card> cardsToAdd) {
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