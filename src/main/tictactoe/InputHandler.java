package tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class InputHandler {
    private BufferedReader reader;

    public InputHandler(BufferedReader reader) {
        this.reader = reader;
    }

    public String getMove(String name) {
        String userMove = null;
        System.out.print("Enter a number from 1 - 9, "+name+": ");
        try {
            userMove = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return userMove;
    }
}
