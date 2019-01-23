package com.codecool.battleofcards;

public class Card {
    private int id;
    private String name;
    private int attack;
    private int defense;
    private int hp;
    private int speed;

    public Card(int id, String name, int attack, int defense, int hp, int speed) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getdefense() {
        return defense;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String cardToString () {
        String leftAlignFormat =
                "+====+=====================+\n"+
                        "|@@@@|                     | \n"+
                        "|@@@@| name : %-5s        | \n"+ "+====+=====================+\n"+
                        "|####| 1.attack     : %-5s | \n"+
                        "|####|                     | \n"+
                        "|####| 2.defense    : %-5s | \n"+
                        "|####|                     | \n"+
                        "|####| 3.HP         : %-5s | \n"+
                        "|####|                     | \n"+
                        "|####| 4.speed      : %-5s | \n"+
                        "|####|                     | \n"+
                        "+====+=====================+%n";
        return String.format(leftAlignFormat, name ,attack, defense, hp, speed);


    }
}