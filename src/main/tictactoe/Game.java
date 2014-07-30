package tictactoe;

import java.io.InputStream;
import java.io.PrintStream;

import static java.lang.System.out;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Game {
    private String board;
    private GameHelper helper;
    private InputStream in;
    private PrintStream out;

    public Game(InputStream in, PrintStream out) {
        this.in = in;
        this.out = out;
        helper = new GameHelper(in);
        board = "  |  |  \n\n---------\n\n  |  |  \n\n---------\n\n  |  |  ";
    }

    public void printBoard() {
        out.println(board);
    }

    public int getUserMove() {
        String move = helper.getMove();
        return Integer.parseInt(move);
    }
}
