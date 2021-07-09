package com.lagou.homework12;

public class Board {
    // an array to keep the


    private char[][] board = new char[16][16];
// constructor
    public Board (){
        for (int i = 0; i < 16; i++){
            for (int j = 0; j < 16; j++){
                board[i][j] = '+';
            }
        }
    }
// conver string number 1-f to 1-16
    public static int NumCover(String str){
        switch(str){
            case "0": return 0;
            case "1": return 1;
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "a": return 10;
            case "b": return 11;
            case "c": return 12;
            case "d": return 13;
            case "e": return 14;
            case "f": return 15;
            case "g": return 16;
            default: return -1;
        }
    }
//print current board
    public void printBoard(){
        System.out.print("   ");
        for(int i1 = 0; i1 < 16; i1++){

            if (i1 <= 9){
                System.out.print(""+i1+ "  ");
            }
            else{
                int num = 87+i1;
                System.out.print((char)num + "  ");
            }
        }


        for (int i = 0; i < 16; i++){
            System.out.println();
            if (i <= 9){
                System.out.print(""+i+ "  ");
            }
            else{
                int num = 87+i;
                System.out.print(""+(char)num + "  ");
            }
            for (int j = 0; j < 16; j++){

                System.out.print(board[i][j]+"  ");
            }
        }
    }
//check if this spot is able to place a checker
    public boolean ifValid(int col, int line){
        if(col >= 16 | col <=-1 | line >= 16 | line <= -1){
            return false;
        }
        if (board[col][line] == '+'){
            return true;
        }
        else {
            return false;
        }
    }
//check if spot has a checker
    public boolean hasChecker(int col, int line){
        if(col >= 16 | col <=-1 | line >= 16 | line <= -1 ){
            return false;
        }
        else if (board[col][line] == '+'){
            return false;
        }
        return true;
    }
//place a ckecker on this spot
    public void changeBoard(int col, int line, char checker){
        if (ifValid(col, line)){
            board[col][line] = checker;
        }
        else{
            System.out.println("This spot has been placed before. ");
        }
    }






//
//public static void main(String[] ars){
//    Board b1 = new Board();
//    b1.printBoard();
//}

}
