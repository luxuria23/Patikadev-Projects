package MineSweeper;

import java.util.Scanner;



public class MineSweeper {
    int[][] table;
    int mineNum;
    int row;
    int col;

    //constructor
    MineSweeper(int row, int col){
        table = new int[row][col];
        this.mineNum =  row * col / 4;
        this.row = row;
        this.col = col;
    }

    //game starter
    void start(){
        initialMines();
        gameLoop();
    }

    //its main game loop its asking continually to user give col and row after that
    //it call player move method
    //method returns false if game is lose
    void gameLoop(){
        Scanner sc = new Scanner(System.in);
        int col,row;

        while (true) {

            printTable();

            //user input
            System.out.print("Give row: ");
            row = sc.nextInt() - 1;
            System.out.print("Give col: ");
            col = sc.nextInt() - 1;

            //control out of bond
            if (row < 0 || row >= this.row || col < 0 || col >= this.col ) {
                System.out.println("out of bonds");
                continue;
            }

            
            if(!playerMove(row,col)){
                resultTable();
                System.out.println("You lose");
                break;
            }
            if(isWin()){
                resultTable();
                System.out.println("You Win");
                break;
            }
        }
        sc.close();
    }

    //checks untouched cells if there is any returns false else returns true
    boolean isWin(){
        boolean isZeroReamin = false;
        for (int[] is : table) {
            for (int i : is) {
                if(i == 0){
                    isZeroReamin = true;
                }
            }
        }
        return !isZeroReamin;
    }

    //this method checks the index and returns false if there is a mine
    //else it calls findMineNum method and assign return value to index
    boolean playerMove(int row, int col){
        if (table[row][col] < 0) {
            return false;
        }else{
            table[row][col] = findMineNum(row,col);
            return true;
        }
        
    }

    //it looks up nearby mines and returns mine number
    //if there is no mine it returns 9
    int findMineNum(int row, int col){
        int mineNum = 0;
        for(int i = row - 1; i < row + 2; i++){
            if(i < 0 || i >= this.row){
                continue;
            }else{
                for (int j = col - 1; j < col + 2; j++) {
                    if (j < 0 || j>= this.col) {
                        continue;
                    }else{
                        if(table[i][j] == -1){
                            mineNum++;
                        }
                    }
                }
            }
        }
        if(mineNum == 0) return 9;
        else return mineNum;
    }

    //its randomly generates mines
    void initialMines(){
        int mineNum = 0;
        int index,row,col;
        while(mineNum < this.mineNum){
            index = (int)(Math.random() * this.row * this.col);
            row = (index / this.row);
            col = (index % this.row); 
            if (table[row][col] == 0) {
                table[row][col] = -1;
                mineNum++;
            }
        }
    }

    //its print table according to these rules
    //when player select cell and its have 0 mines around cells value changes to 9
    //so if cell's value 9 it must print "0"
    //if cell's value 0 it means default so must print "-"
    //if cell's value -1 it means there is mine but still must print "-"
    void printTable(){
        String response;
        for (int[] row : table) {
            for (int col : row) {
                if (col < 1) {
                    response = "-  ";
                }else if (col == 9){
                    response = "0  ";
                }else{
                    response = col + "  ";
                }
                System.out.print(response);
            }
            System.out.println();
        }
    }

    //its prints result table
    void resultTable(){
        String response;
        for (int[] row : table) {
            for (int col : row) {
                if (col == -1) {
                    response = "*  ";
                } else if (col == 0) {
                    response = "-  ";
                }else if (col == 9){
                    response = "0  ";
                }else {
                    response = col + "  ";
                }
                System.out.print(response);
            }
            System.out.println();
        }
    }
}
