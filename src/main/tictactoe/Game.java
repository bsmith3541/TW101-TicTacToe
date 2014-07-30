package tictactoe;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static java.lang.System.out;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Game {
    private String[] board;
    private GameHelper helper;
    private InputStream in;
    private PrintStream out;

    public Game(InputStream in, PrintStream out) {
        this.in = in;
        this.out = out;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        helper = new GameHelper(reader);
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

    public int getUserMove(int turn) {
        String move = helper.getMove(turn);
        return Integer.parseInt(move);
    }

    public void updateBoard(int move, String shape) {
        board[move-1] = shape;
    }
}
