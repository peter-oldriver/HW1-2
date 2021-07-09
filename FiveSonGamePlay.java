package com.lagou.homework12;

import java.util.Scanner;

public class FiveSonGamePlay {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! Let's Start!");
        System.out.println( "player 1 checker : O");
        Player p1 = new Player('O');
        System.out.println( "player 2 checker : X");
        Player p2 = new Player('X');
        System.out.println("Creating Board...");
        Board b = new Board();
        b.printBoard();
        System.out.println("Game Start! ");

        while(p1.status != 1 && p2.status != 1) {
            while (p1.status != 1 && p2.status != 1) {
                System.out.println("Player 1, please make your move:");
                System.out.println("Enter the col and line your want to place your checker:");
                System.out.println("COL:");
                int p1LINE = Board.NumCover(sc.next());
                System.out.println("LINE:");
                int p1COL = Board.NumCover(sc.next());


                if (p1.ifValid(p1COL, p1LINE) && b.ifValid(p1COL, p1LINE)) {
                    b.changeBoard(p1COL, p1LINE, p1.checker);
                    p1.nextMove(p1COL, p1LINE);
                    if (p1.ifWin(p1COL, p1LINE)) {
                        p1.status = 1;
                        break;
                    }
                    break;
                } else {
                    System.out.println("Invalid Spot! Please Enter again!");
                }
            }
            b.printBoard();
            while (p1.status != 1 && p2.status != 1){
                System.out.println("Player 2, please make your move:");
                System.out.println("Enter the col and line your want to place your checker:");
                System.out.println("COL:");
                int p2LINE = Board.NumCover(sc.next());
                System.out.println("LINE:");
                int p2COL = Board.NumCover(sc.next());


                if (p2.ifValid(p2COL, p2LINE) && b.ifValid(p2COL, p2LINE)) {
                    b.changeBoard(p2COL, p2LINE, p2.checker);
                    p2.nextMove(p2COL, p2LINE);
                    if (p2.ifWin(p2COL, p2LINE)) {
                        p2.status = 1;
                        break;
                    }
                    break;
                } else {
                    System.out.println("Invalid Spot! Please Enter again!");
                }
            }
            b.printBoard();
        }
        System.out.println("Game Ends!");
        if(p1.status == 1){
            System.out.println("Player1 Wins!");
        }

        else{
            System.out.println("Player2 Wins!");
        }
    }
}
