package tictactoe;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class Main {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer(System.in, System.out);
        player.play();
    }
}
