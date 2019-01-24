package com.codecool.battleofcards;

public class ControllerGame {
    View view = new View();
    Table table = new Table();
    Card card;
    Player currentPlayer = table.getPlayerOne();

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
        } else {
            currentPlayer = table.getPlayerOne();
        }
    }

    public void run(){
        View view = new View();
        view.printText("Welcome to Card battle: Pokemon! what you want to do?");
        view.displayMenu();
    
        boolean applicationStarted = true;

        while (applicationStarted) {
            char choice = view.getUserInput();
            
            if (choice == '1' && table.checkIfDeckIsEven()) {//add condition if listOfPlayer is empty
                System.out.println(currentPlayer.getTopCard().cardToString());//get card of second Player
                Card playerOneCard = table.getPlayerOne().getTopCard();
                Card playerTwoCard = table.getPlayerTwo().getTopCard();
                view.printText("Please select your attribute:");
                StatEnum input = getValidatedInput();
                int compareResult = table.compareStats(playerOneCard, playerTwoCard, input);
                if (compareResult < 0) {
                    view.printText("Player Two wins");
                    table.getPlayerTwo().addCardToTheBottom(playerOneCard);
                    table.getPlayerTwo().addCardToTheBottom(playerTwoCard);
                    if (!table.isDrawedCardsEmpty()) {
                        table.addCardToTheBottom(table.getDrawedCards(), table.getPlayerTwo());
                        table.clearDrawCards();
                    }
                } else if (compareResult > 0) {
                    view.printText("Player One wins");
                    table.getPlayerOne().addCardToTheBottom(playerTwoCard);
                    table.getPlayerOne().addCardToTheBottom(playerOneCard);
                    if (!table.isDrawedCardsEmpty()) {
                        table.addCardToTheBottom(table.getDrawedCards(), table.getPlayerOne());
                        table.clearDrawCards();
                    }
                } else if (compareResult == 0){
                    view.printText("It's a draw!");
                    table.addCardToDrawedCards(playerOneCard);
                    table.addCardToDrawedCards(playerTwoCard);
                }
                switchPlayer();
            } else if (choice == '2') {

            } else if (choice == '3') {
                System.exit(0);

            }
        }
    }
}

