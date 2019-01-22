package com.codecool.battleofcards;

public class ControllerGame {

    public void run(){
        View view = new View();
        view.displayMenu();
        view.printText("Welcome to Card battle: Pokemon! what you want to do?");

        boolean applicationStarted = true;

        while (applicationStarted) {
            int choice = view.getUserInput();
            if (choice == 1) {
                Table table = new Table();
                // startujemy gre

            } else if (choice == 2) {

            } else if (choice == 3) {
                System.exit(0);

            }
        }
    }
}
