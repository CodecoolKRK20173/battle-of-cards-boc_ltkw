package com.codecool.battleofcards;

import java.util.concurrent.TimeUnit;

public class ControllerGame {
    View view = new View();
    Table table = new Table();
    Card card;
    Player currentPlayer = table.getPlayerOne();
    Player otherPlayer = table.getPlayerTwo();
    boolean isRunning = true;
    boolean gameIsPlayed = true;

    private StatEnum getValidatedInput() {

        boolean incorrectInput = true;
        char userInput;

        while (incorrectInput) {
            userInput = view.getUserInput();
            switch (userInput) {
                case '1':
                    return StatEnum.ATTACK;
                case '2':
                    return StatEnum.DEFENSE;
                case '3':
                    return StatEnum.HP;
                case '4':
                    return StatEnum.SPEED;
                default:
                    view.printText("Invalid input, type correct data.");
            }
        }
        return null;
    }

    public void switchPlayer() {
        if (currentPlayer.equals(table.getPlayerOne())) {
            currentPlayer = table.getPlayerTwo();
            otherPlayer = table.getPlayerOne();
        } else {
            currentPlayer = table.getPlayerOne();
            otherPlayer = table.getPlayerTwo();
        }
    }

    public void run() {
        View view = new View();
        view.clearScreen();
        view.printText("Welcome to Card battle: Pokemon! what you want to do?");
        view.displayMenu();
        while (isRunning) {
            char choice = view.getUserInput();
            if (choice == '1' && table.checkIfDeckIsEven()) {//add condition if listOfPlayer is empty
                view.clearScreen();
                while(gameIsPlayed) {
                    System.out.println("You have " + currentPlayer.getCards().size() + " cards.");
                    System.out.println("Opponent has " + otherPlayer.getCards().size() + " cards.");
                    view.printText(currentPlayer.getTopCard().cardToString());
                    table.addToCurrentlyPlayedCards(currentPlayer.getTopCard());
                    table.addToCurrentlyPlayedCards(otherPlayer.getTopCard());
                    Card playerOneCard = currentPlayer.getTopCardAndRemoveIt();
                    Card playerTwoCard = otherPlayer.getTopCardAndRemoveIt();
                    view.printText("Please select your attribute:");
                    StatEnum input = getValidatedInput();
                    int compareResult = table.compareStats(playerOneCard, playerTwoCard, input);
                    if (compareResult < 0) {
                        view.clearScreen();
                        view.printText("You lost!");
                        holdForMilisecond(2000);
                        table.giveCardsToWinner(otherPlayer);
                    } else if (compareResult > 0) {
                        view.clearScreen();
                        view.printText("You won!");
                        holdForMilisecond(2000);
                        table.giveCardsToWinner(currentPlayer);
                    } else if (compareResult == 0) {
                        view.clearScreen();
                        view.printText("It's a draw!");
                        holdForMilisecond(2000);
                        table.addCurrentlyPlayedCardsToDrawedCards();
                    }
                    int gameOver = checkIfGameOver();
                    displayWinMessage(gameOver);
                    switchPlayer();
                    view.clearScreen();
                }
            } else if (choice == '2') {


            } else if (choice == '3') {
                System.exit(0);

            }
        }
    }

    private static void holdForMilisecond(int timeSleep) {
		try {
			TimeUnit.MILLISECONDS.sleep(timeSleep);
		} catch (InterruptedException ex) {
			System.out.println();
		}
	}

    public int checkIfGameOver() {
        if (currentPlayer.checkIfEmpty()) {
            return 2;
        } else if (otherPlayer.checkIfEmpty()) {
            return 1;
        }
        return 0;
    }

    public void displayWinMessage(int result) {
        switch (result) {
            case 1: 
                view.printWinState();
                holdForMilisecond(5000);
                playGame();
                break;
            case 2:
                view.printGameOver();
                holdForMilisecond(5000);
                playGame();
                break;
        }
    }
    public void playGame() {
        ControllerGame controllerGame = new ControllerGame();
        controllerGame.run();
    }
}


