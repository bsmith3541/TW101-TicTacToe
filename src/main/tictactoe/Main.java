package tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Main {
    public static void main(String[] args) {
        Board board = new Board(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputHandler input = new InputHandler(reader);
        Player player1 = new Player(input, "X", "Player 1");
        Player player2 = new Player(input, "O", "Player 2");
        Game game = new Game(board, player1, player2);
        game.start();
    }
}
