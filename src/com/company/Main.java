package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Let's play Tic-Tac-Toe!");
        System.out.println("Our board will look like this, " +
                "with each number representing that spot on the board:");
        System.out.println(" 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9 ");

        boolean game = false;
        String user = "";
        String comp = "";
        int ff = 0;

        System.out.println("Do you want to be X's or O's? (Enter X or O)");
        String team = kb.next();

        if (team.equalsIgnoreCase("X")) {
            System.out.println("Okay, You're X's, I'm O's, I go first.");
            user = "X";
            comp = "O";
            System.out.println(board.turn("O", 1));

        } else {
            System.out.println("Okay, you're O's, I'm X's, you go first.");
            user = "O";
            comp = "X";
        }

        while (!game) {

            if (ff % 2 == 0) {

                System.out.println("\nEnter the corresponding number for where you would like to go.");
                System.out.println(board.turn(user, kb.nextInt()));
                ff++;
            }

             else if (ff % 2 == 1) {
                System.out.println(board.turn(comp, board.compTurn(comp)));
                ff++;
             }

            game = board.endCheck();
    }

        System.out.println("Thanks for playing!");

}
}
