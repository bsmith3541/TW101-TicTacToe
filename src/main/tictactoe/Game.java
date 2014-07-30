package tictactoe;

import java.io.PrintStream;

import static java.lang.System.out;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Game {
    private String board;

    public Game() {
        board = "  |  |  \n\n---------\n\n  |  |  \n\n---------\n\n  |  |  ";
    }
    public void printBoard(PrintStream out) {
        out.println(board);
    }
}
