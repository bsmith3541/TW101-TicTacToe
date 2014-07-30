package tictactoe;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GamePlayer {
    private Game game;

    public GamePlayer(InputStream in, PrintStream out) {
        game = new Game(in, out);
    }

    public void play() {
        game.printBoard();
        int move = 1;
        String shape;
        while(true) {
            if(move%2==1) {
                shape = "X";
            } else {
                shape = "O";
            }
            int userMove = game.getUserMove(move);
            game.updateBoard(userMove, shape);
            game.printBoard();
            move++;
        }
    }
}
