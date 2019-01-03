package com.company;

public class board {
    private static String brd [] = {"\t","\t","\t","\t","\t","\t","\t","\t","\t","\t"};
    private static boolean checker [] = new boolean[10];
    private static String out;
    private static String wrong = "Please enter a blank square.";


    public static String turn (String a, int b) {

        if ((brd [b]).equalsIgnoreCase("\t")) {
            brd [b] = " " + a + " ";
            checker [b] = true;

            out = brd [1] + "|" + brd [2] + "|" + brd [3] + "\n-----------\n" + brd [4] + "|" + brd [5] + "|" + brd [6]
                    + "\n-----------\n" + brd [7] + "|" + brd [8] + "|" + brd [9];
            return out;
        }
        else {
            return wrong;
        }

    }

    public static boolean check (int c) {
        if (checker [c]) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean endCheck () {
        if (((brd [1]+ brd [2] + brd [3]).equalsIgnoreCase(" x  x  x ")) ||
                ((brd [4]+ brd [5] + brd [6]).equalsIgnoreCase(" x  x  x ")) ||
                    ((brd [7]+ brd [8] + brd [9]).equalsIgnoreCase(" x  x  x ")) ||
                        ((brd [1]+ brd [4] + brd [7]).equalsIgnoreCase(" x  x  x ")) ||
                            ((brd [2]+ brd [5] + brd [8]).equalsIgnoreCase(" x  x  x ")) ||
                                ((brd [3]+ brd [6] + brd [9]).equalsIgnoreCase(" x  x  x ")) ||
                                    ((brd [1]+ brd [5] + brd [9]).equalsIgnoreCase(" x  x  x ")) ||
                                        ((brd [3]+ brd [5] + brd [7]).equalsIgnoreCase(" x  x  x "))) {
            return true;
        }
        else if (((brd [1]+ brd [2] + brd [3]).equalsIgnoreCase(" o  o  o ")) ||
                    ((brd [4]+ brd [5] + brd [6]).equalsIgnoreCase(" o  o  o ")) ||
                        ((brd [7]+ brd [8] + brd [9]).equalsIgnoreCase(" o  o  o ")) ||
                            ((brd [1]+ brd [4] + brd [7]).equalsIgnoreCase(" o  o  o ")) ||
                                ((brd [2]+ brd [5] + brd [8]).equalsIgnoreCase(" o  o  o ")) ||
                                    ((brd [3]+ brd [6] + brd [9]).equalsIgnoreCase(" o  o  o ")) ||
                                        ((brd [1]+ brd [5] + brd [9]).equalsIgnoreCase(" o  o  o ")) ||
                                            ((brd [3]+ brd [5] + brd [7]).equalsIgnoreCase(" o  o  o "))) {
            return true;
        }
        else return false;


    }
}
