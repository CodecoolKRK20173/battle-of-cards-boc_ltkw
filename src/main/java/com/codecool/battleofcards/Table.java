package com.codecool.battleofcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Table {

    private Player playerOne;
    private Player playerTwo;
    private Deck deck;
    private List<Card> drawedCards;
    private List<Card> currentlyPlayedCards;
    private Dealer dealer;

    public Table() {
        playerOne = new Player();
        playerTwo = new Player();
        drawedCards = new ArrayList<Card>();
        currentlyPlayedCards = new ArrayList<Card>();
        dealer = new Dealer();
        dealCardsToPlayers();
    }
    public Player getPlayerOne(){
        return playerOne;
    }
    public Player getPlayerTwo (){
        return playerTwo;
    }

    public boolean checkIfDeckIsEven(){
        return dealer.isDeckSizeEven();
    }

    public int compareStats(Card playerOneCard, Card playerTwoCard, StatEnum stat) {
        StatComparator comparator = new StatComparator();
        switch (stat) {
            case ATTACK:
                return comparator.compare(playerOneCard.getAttack(), playerTwoCard.getAttack());
            case DEFENSE:
                return comparator.compare(playerOneCard.getdefense(), playerTwoCard.getdefense());
            case HP:
                return comparator.compare(playerOneCard.getHp(), playerTwoCard.getHp());
            case SPEED:
                return comparator.compare(playerOneCard.getSpeed(), playerTwoCard.getSpeed());
            default:
                return 0;
                

        }
    }

    public void dealCardsToPlayers() {
        dealer.dealCards();
        playerOne.setCards(dealer.getPlayerOneHand());
        playerTwo.setCards(dealer.getPlayerTwoHand());
    }

    public void addCardToTheBottom(List<Card> cards, Player player) {
        for(Card card : cards) {
            player.addCardToTheBottom(card);
        }
        
    }

    public boolean isDeckEmpty() {
        if (drawedCards.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<Card> getDrawedCards() {
        return drawedCards;
    }

    public void clearDrawCards() {
        drawedCards.clear();
    }
}