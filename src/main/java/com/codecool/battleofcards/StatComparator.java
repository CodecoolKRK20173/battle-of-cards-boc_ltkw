package com.codecool.battleofcards;

import java.util.Comparator;

public class StatComparator implements Comparator<Integer> {

    //@Override
    public int compare(Integer playerOneStat, Integer playerTwoStat) {
        return (playerOneStat - playerTwoStat);
    }
}