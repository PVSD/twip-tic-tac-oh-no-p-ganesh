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
            System.out.println( board.turn("O", 1));

        }
        else {
            System.out.println("Okay, you're O's, I'm X's, you go first.");
            user = "O";
            comp = "X";
        }

        while (!game){

            if (ff%2 == 0) {
                System.out.println("\nEnter the corresponding number for where you would like to go.");
                System.out.print(board.turn(user, kb.nextInt()));
                ff++;
            }
            else if (ff%2 == 1) {
                if (user.equalsIgnoreCase("X")) {
                    if (!board.check(9))
                        System.out.print("\n" + board.turn(comp, 9));
                    else if (!board.check(5))
                        System.out.println("\n" + board.turn(comp, 5));
                    else if (!board.check(3))
                        System.out.println("\n" + board.turn(comp, 3));
                    else if (!board.check(7))
                        System.out.println("\n" + board.turn(comp, 7));
                    else if (!board.check(4))
                        System.out.println("\n" + board.turn(comp, 4));
                    else if (!board.check(2))
                        System.out.println("\n" + board.turn(comp, 2));
                    else if (!board.check(6))
                        System.out.println("\n" + board.turn(comp, 6));
                    else if (!board.check(8))
                        System.out.println("\n" + board.turn(comp, 8));
                } else if (user.equalsIgnoreCase("O") && !board.check(5))
                    System.out.println("\n" + board.turn(comp, 5));
                ff ++;
            }
            game = board.endCheck();
        }

        System.out.println("\nThanks for playing!");
    }
}