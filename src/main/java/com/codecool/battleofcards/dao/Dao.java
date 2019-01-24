package com.codecool.battleofcards.dao;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

import com.codecool.battleofcards.model.Card;

public class Dao {
    private Card card;
    private ArrayList<Card> cards;
    private ArrayList<ArrayList<String>> cardInformation = new ArrayList<ArrayList<String>>();
    private String filePath = "Pokemons.csv";

    public Dao() {
        cards = new ArrayList<Card>();
    }

    public void readCSV(String fileName) {
        Scanner openFile = null;
        try {
            ClassLoader loader = getClass().getClassLoader();
            File file = new File(loader.getResource(fileName).getFile());
            openFile = new Scanner(file);
            openFile.useDelimiter("\n");

        } catch(FileNotFoundException error){
            error.printStackTrace();
        } 
        while (openFile.hasNext()) {
            String next = openFile.next();
            ArrayList<String> row = new ArrayList<String>();
            String[] columns = next.split(";");
            for(String column : columns) {
                row.add(column);
            }
            cardInformation.add(row);
        }
        openFile.close();
    }

    public void addCards() {
        readCSV(filePath);
        for(ArrayList<String> cardInf : cardInformation) {
            int index = Integer.valueOf(cardInf.get(0));
            String name = cardInf.get(1);
            int attack = Integer.valueOf(cardInf.get(2));
            int defense = Integer.valueOf(cardInf.get(3));
            int hp = Integer.valueOf(cardInf.get(4));
            int speed = Integer.valueOf(cardInf.get(5));
            card = new Card(index, name, attack, defense, hp, speed);
            cards.add(card);
        } 
    }

    public ArrayList<Card> getCards() {
        addCards();
        return cards;
    }
}