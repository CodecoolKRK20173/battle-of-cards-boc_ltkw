package com.codecool.battleofcards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.codecool.battleofcards.model.Card;
import com.codecool.battleofcards.model.Deck;

public class Dealer {

    Deck deck = new Deck();
    private List<Card> playerOneHand;
    private List<Card> playerTwoHand;

    public Dealer() {
        playerOneHand = new ArrayList<Card>();
        playerTwoHand = new ArrayList<Card>();
    }

    public void dealCards() {
        List<Card> shuffledDeck = getShuffledDeck();
        int startPoint = 0;
        int midPoint = shuffledDeck.size() / 2;
        int endPoint = shuffledDeck.size();
        playerOneHand = new ArrayList<Card>(shuffledDeck.subList(startPoint, midPoint));
        playerTwoHand = new ArrayList<Card>(shuffledDeck.subList(midPoint, endPoint));
    }

    /**
     * shuffles the deck
     * 
     * @return deck shuffled randomly
     */
    private List<Card> getShuffledDeck() {
        List<Card> arrangedDeck = deck.getCards();
        Collections.shuffle(arrangedDeck);
        return arrangedDeck;
    }

    /**
     * the method can be used in controller in order to verify a size of the deck.
     * if the value is true: - dealCards() method is invoked, otherwise the game
     * should fail to start
     * 
     * @param shuffledDeck
     * @return boolean
     */
    public boolean isDeckSizeEven() {
        List<Card> shuffledDeck = getShuffledDeck();
        if (shuffledDeck.size() % 2 == 0) {
            return true;
        }
        return false;
    }

    public List<Card> getPlayerOneHand() {
        return playerOneHand;
    }

    public List<Card> getPlayerTwoHand() {
        return playerTwoHand;
    }
}