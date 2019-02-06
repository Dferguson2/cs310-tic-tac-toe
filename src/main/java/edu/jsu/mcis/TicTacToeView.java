package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
        
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        int row;
        int col;
        
        if (isXTurn){
            System.out.println("X's Turn:" + "\n" + "Please enter 2 numbers seperated by a space to choose a location on the grid to place your mark. Ex. 1 1");

            row = Integer.parseInt(keyboard.next());
            col = Integer.parseInt(keyboard.next());

            TicTacToeMove move = new TicTacToeMove(row, col);
            return(move);
         }

        else{
            System.out.println("O's Turn:" + "\n" + "Please enter 2 numbers seperated by a space to choose a location on the grid to place your mark. Ex. 1 1");
            
            row = Integer.parseInt(keyboard.next());
            col = Integer.parseInt(keyboard.next());

            TicTacToeMove move = new TicTacToeMove(row, col);
            return(move);
            }     
    }





    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
