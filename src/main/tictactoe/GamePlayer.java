package tictactoe;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GamePlayer {
    private Game game;
    private int turn;
    private String shape;
    private boolean isOver;

    public GamePlayer(InputStream in, PrintStream out) {
        game = new Game(in, out);
        turn = 1;
        isOver = false;
    }

    public void play() {
        game.printBoard();
        int move;
        while(!isOver) {
            if(turn %2==1) {
                shape = "X";
            } else {
                shape = "O";
            }
            move = game.getUserMove(turn);
            if(game.updateBoard(move, shape) != -1) {
                turn++;
            }
            game.printBoard();
        }
    }
}
