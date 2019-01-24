package com.codecool.battleofcards;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Player {

    private ArrayList<Card> cards;

    public Player() {
        this.cards = new ArrayList<Card>();
    }

    public Card getTopCard() {
        //Collections.synchronizedList(cards);
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
}