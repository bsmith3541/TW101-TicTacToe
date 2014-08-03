package tictactoe;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private int turn;
    private String shape;
    private boolean isOver;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        turn = 1;
        isOver = false;
    }

    public void start() {
        Player currentPlayer;
        board.printBoard();
        int move;
        while (!isOver) {
            if(turn%2==1) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }
            currentPlayer.makeMove(board);
            if(isOver = board.isOver()) {
                // end game
            }
            turn++;
            board.printBoard();
        }
    }
}
