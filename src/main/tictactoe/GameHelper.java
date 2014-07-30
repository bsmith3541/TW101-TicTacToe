package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GameHelper {
    private InputStream in;

    public GameHelper(InputStream in) {
        this.in = in;
    }
    public String getMove() {
        String userMove = null;
        System.out.print("Enter a number from 1 - 9: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        try {
            userMove = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return userMove;
    }
}