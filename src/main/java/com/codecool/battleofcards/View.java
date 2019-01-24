package com.codecool.battleofcards;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class View {

    public char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);

    }


    public void displayMenu() {
        printLogo();
        System.out.println("Welcome to Pokemon cards game!");
        System.out.println( "1. Start game\n"+
                            "2. Show authors\n"+
                            "3. Quit game\n");

    }

    public void printText(String yourText) {
        System.out.println(yourText.toString());

    }

    public void clearScreen() {
		System.out.print("\033[H\033[2J");
        System.out.flush();    
    }

    private void printLogo() {
        Scanner logoTop = null;
        Scanner pikachuLogoBottom = null;
        String logo = "";

        try {
            logoTop = new Scanner(new File("src/main/resources/logoTop.txt"));
            pikachuLogoBottom = new Scanner(new File("src/main/resources/pikachuLogoBottom.txt"));
        } catch (FileNotFoundException e) {
            printText(e.getMessage());
        }

        while (logoTop.hasNext()) {
            logo += "\u001B[91m" + logoTop.nextLine() + "\u001B[0m" + "\n";
        }
        while (pikachuLogoBottom.hasNext()) {
            logo += "\u001B[93m" + pikachuLogoBottom.nextLine() + "\u001B[0m" + "\n";
        }
        printText(logo);
    }

    public void printWinState() {
        Scanner pikachuWinTop = null;
        Scanner pikahchuWinTextBottom = null;
        String logo = "";

        try {
            pikachuWinTop = new Scanner(new File("src/main/resources/pikachuWinTop.txt"));
            pikahchuWinTextBottom = new Scanner(new File("src/main/resources/pikachuWinTextBottom.txt"));
        } catch (FileNotFoundException e) {
            printText(e.getMessage());
        }

        while (pikachuWinTop.hasNext()) {
            logo += "\u001B[93m" + pikachuWinTop.nextLine() + "\u001B[0m" + "\n";
        }
        while (pikahchuWinTextBottom.hasNext()) {
            logo += "\u001B[94m" + pikahchuWinTextBottom.nextLine() + "\u001B[0m" + "\n";
        }
        printText(logo);
    }

    public void printGameOver() {
        Scanner gameOverTop = null;
        Scanner gameOverLogoTop = null;
        Scanner gameOverLogoBottom = null;
        String logo = "";

        try {
            gameOverTop = new Scanner(new File("src/main/resources/gameOverVenusaurTop.txt"));
            gameOverLogoTop = new Scanner(new File("src/main/resources/gameOverLogoTop.txt"));
            gameOverLogoBottom = new Scanner(new File("src/main/resources/gameOverLogoBottom.txt"));
        } catch (FileNotFoundException e) {
            printText(e.getMessage());
        }

        while (gameOverTop.hasNext()) {
            logo += "\u001B[32m" + gameOverTop.nextLine() + "\u001B[0m" + "\n";
        }
        while (gameOverLogoTop.hasNext()) {
            logo += "\u001B[93m" + gameOverLogoTop.nextLine() + "\u001B[0m" + "\n";
        }
        while (gameOverLogoBottom.hasNext()) {
            logo += "\u001B[91m" + gameOverLogoBottom.nextLine() + "\u001B[0m" + "\n";
        }
        printText(logo);
    }
    public void displayAuthors() {
        clearScreen();
        printLogo();
        printText("Yelizareta Chernykh\n" +
                                "Wojtek Charuza\n"+
                                "Tatiana Slonimskaia\n"+
                                "Kamil Bracki\n");
        printText("1. Back to menu\n" +
                                            "2. Exit");
    }
}