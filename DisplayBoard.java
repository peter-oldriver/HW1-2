package com.lagou.homework12;

import java.util.Random;


public class DisplayBoard {
    public static int[][] board = new int[16][16];
    Random radiant = new Random();

//constructor
    public DisplayBoard (){
        for (int i = 0; i < 16; i++){
            for (int j = 0; j < 16; j++){
                board[i][j] = radiant.nextInt(101);
            }
        }
    }

    public void printBoard (){
        for (int i = 0; i < 16; i++){
            for (int j = 0; j < 16; j++){
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void colSum(){
        int col_cur_sum;
        for (int i = 0; i < 16; i++){
            col_cur_sum = 0;

            for (int j = 0; j < 16; j++){
                col_cur_sum += board[j][i];
            }
            System.out.println("Column " + i +" : "+ col_cur_sum);
        }
    }

    public void lineSum(){
        int line_cur_sum;
        for (int i = 0; i < 16; i++){
            line_cur_sum = 0;

            for (int j = 0; j < 16; j++){
                line_cur_sum += board[i][j];
            }
            System.out.println("Line " + i +" : "+ line_cur_sum);
        }
    }

    public static void main(String[] args){
        System.out.println("Create Board:");
        DisplayBoard b1 = new DisplayBoard();
        System.out.println("--------------------------------");
        System.out.println("Display Board: ");
        b1.printBoard();
        System.out.println("--------------------------------");
        b1.lineSum();
        b1.colSum();


    }
}
