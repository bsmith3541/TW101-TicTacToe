package tictactoe;

import java.io.PrintStream;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Board {
    private String[] board;
    private InputHandler helper;
    private PrintStream out;

    public Board(PrintStream out) {
        this.out = out;
        board = new String[] {"", "", "", "", "", "", "", "", ""};
    }

    public void printBoard() {
        int offset = 0;
        for(int i = 0; i <=4; i++)
        {
            if(i%2==0) {
                out.printf("%-3s | %-3s | %-3s%n", board[i+offset], board[i+offset+1], board[i+offset+2]);
                offset++;
            } else {
                out.println("----------------");
            }
        }
    }

    // mark board
    public boolean addMove(int move, String shape) {
        if(board[move-1] == "") {
            board[move-1] = shape; // WARNING: ASK BILL, can we fix these booleans(?)?
            return true;
        } else {
            out.println("Location already taken");
            return false;
        }
//        return true;
    }

    public boolean isOver() {
        if(isDraw() || isWin()) {
            // signal end of game
            return true;
        }
        return false;
    }

    // just a stub for now
    private boolean isWin() {
        return false;
    }


    // just a stub for now
    private boolean isDraw() {
        return false;
    }
}
