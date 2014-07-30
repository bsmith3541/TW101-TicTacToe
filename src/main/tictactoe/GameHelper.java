package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GameHelper {
    private BufferedReader reader;

    public GameHelper(BufferedReader reader) {
        this.reader = reader;
    }

    public String getMove(int turn, String player) {
        String userMove = null;
        System.out.print("Enter a number from 1 - 9, "+player+": ");
        try {
            userMove = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return userMove;
    }
}
