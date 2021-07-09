package com.lagou.homework12;

public class Player {
    public char checker;
    private Board b = new Board();
    public int status = 0;
// constructor
    public Player(char checker){
        this.checker = checker;
    }

    public void nextMove(int col, int line){
        b.changeBoard(col, line, checker);
    }

    private boolean checkHori(int col, int line){
        int count = 1;
        int currentPoint = 1;
        while (b.hasChecker(col + currentPoint, line)){
            //if(count == 5){return true;}
            count ++;
            currentPoint ++;if(count == 5){return true;}
        }
        currentPoint = 1;
        while (b.hasChecker(col - currentPoint, line)){
            //if(count == 5){return true;}
            count ++;
            currentPoint ++;if(count == 5){return true;}
        }
        return false;
    }

    private boolean checkVer(int col, int line){
        int count = 1;
        int currentPoint = 1;
        while (b.hasChecker(col, line + currentPoint)){

            count ++;
            currentPoint ++;
            if(count == 5){return true;}
        }
        currentPoint = 1;
        while (b.hasChecker(col, line - currentPoint)){

            count ++;
            currentPoint ++;
            if(count == 5){return true;}
        }
        return false;
    }

    private boolean checkPara1(int col, int line){
        int count = 1;
        int currentPoint = 1;
        while (b.hasChecker(col + currentPoint, line + currentPoint)){
            //if(count == 5){return true;}
            count ++;
            currentPoint ++;if(count == 5){return true;}
        }
        currentPoint = 1;
        while (b.hasChecker(col - currentPoint, line - currentPoint)){
            //if(count == 5){return true;}
            count ++;
            currentPoint ++;if(count == 5){return true;}
        }
        return false;
    }

    private boolean checkPara2(int col, int line){
        int count = 1;
        int currentPoint = 1;
        while (b.hasChecker(col - currentPoint, line + currentPoint)){
            //if(count == 5){return true;}
            count ++;
            currentPoint ++;if(count == 5){return true;}
        }
        currentPoint = 1;
        while (b.hasChecker(col + currentPoint, line - currentPoint)){
            //if(count == 5){return true;}
            count ++;
            currentPoint ++;if(count == 5){return true;}
        }
        return false;
    }

    public boolean ifWin(int col, int line){
        return this.checkPara1(col, line) || this.checkPara2(col, line) || this.checkHori(col, line) ||this.checkVer(col, line);
    }

    public boolean ifValid(int col, int line){
        return b.ifValid(col, line);
    }


//    public static void main(String[] args) {
//        Player p1 = new Player('X');
//        p1.nextMove(6,6);
//        //System.out.println(p1.ifWin(0,0));
//        p1.nextMove(4,8);
//        //System.out.println(p1.ifWin(0,1));
//        p1.nextMove(5,7);
//        //System.out.println(p1.ifWin(0,2));
////        p1.nextMove(0,3);
////        //System.out.println(p1.ifWin(0,3));
////        p1.nextMove(0,4);
//        System.out.println(p1.ifWin(5,7));
//    }
}
