package com.codecool.battleofcards;

public class ControllerGame {
    View view = new View();
    Table table = new Table();
    Card card;

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

    private void switchRound() {
        boolean gameIsRunning = true;        
        int player = 1;
        while (gameIsRunning) {
            switch(player) {
                case 1:

                    player = 2;
                case 2:

                    player = 1;

            }
        }
    }

    public void run(){
        View view = new View();
        view.printText("Welcome to Card battle: Pokemon! what you want to do?");
        view.displayMenu();
    
        boolean applicationStarted = true;

        while (applicationStarted) {
            char choice = view.getUserInput();
            if (choice == '1' && table.checkIfDeckIsEven()) {
                table.getPlayerOne().getTopCard().cardToString();
                Card playerOneCard = table.getPlayerOne().getTopCard();
                Card playerTwoCard = table.getPlayerTwo().getTopCard();
                view.printText("Please select your attribute:");
                StatEnum input = getValidatedInput();
                int compareResult = table.compareStats(playerOneCard, playerTwoCard, input);
                if (compareResult < 0) {
                    view.printText("Player Two wins");
                    table.getPlayerTwo().addCardToTheBottom(playerOneCard);
                    table.getPlayerTwo().addCardToTheBottom(playerTwoCard);
                    if (!table.isDeckEmpty()) {
                        table.addCardToTheBottom(table.getDrawedCards(), table.getPlayerTwo());
                        table.clearDrawCards();
                    }
                } else if (compareResult > 0) {
                    view.printText("Player One wins");
                    table.getPlayerOne().addCardToTheBottom(playerTwoCard);
                    table.getPlayerOne().addCardToTheBottom(playerOneCard);
                    if (!table.isDeckEmpty()) {
                        table.addCardToTheBottom(table.getDrawedCards(), table.getPlayerOne());
                        table.clearDrawCards();

                }

                

            } else if (choice == '2') {

            } else if (choice == '3') {
                System.exit(0);

            }
        }
    }
}
