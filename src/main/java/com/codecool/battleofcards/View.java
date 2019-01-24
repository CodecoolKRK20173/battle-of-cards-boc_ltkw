package com.codecool.battleofcards;

import java.util.Scanner;

public class View {

    

    public void displayCard (Card card) {
        card.toString();
        String leftAlignFormat =
                "+====+=====================+\n"+
                        "|@@@@|                     | \n"+
                        "|@@@@| name : %-5s        | \n"+ "+====+=====================+\n"+
                        "|####| 1.attack     : %-5s | \n"+
                        "|####|                     | \n"+
                        "|####| 2.defence    : %-5s | \n"+
                        "|####|                     | \n"+
                        "|####| 3.HP         : %-5s | \n"+
                        "|####|                     | \n"+
                        "|####| 4.speed      : %-5s | \n"+
                        "|####|                     | \n"+
                        "+====+=====================+%n";
        System.out.format(leftAlignFormat, card.toString());


    }

    public char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);

    }


    public void displayMenu() {
        System.out.println("                              `                  0\n" +
                "  .:XHHHHk.              db.   .;;.     dH  MX   0\n" +
                "oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN\n" +
                "QMMMMMb  \"MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM\n" +
                "  `MMMM.  )M> :X!Hk. MMMM   XMM.o\"  .  MMMMMMM X?XMMM MMM>!MMP\n" +
                "   'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `\" MX MMXXMM\n" +
                "    ~MMMMM~ XMM. .XM XM`\"MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP\n" +
                "     ?MMM>  YMMMMMM! MM   `?MMRb.    `\"\"\"   !L\"MMMMM XM IMMM\n" +
                "      MMMX   \"MMMM\"  MM       ~%:           !Mh.\"\"\" dMI IMMP\n" +
                "      'MMM.                                             IMX\n" +
                "       ~M!M                                             IMP");

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
}