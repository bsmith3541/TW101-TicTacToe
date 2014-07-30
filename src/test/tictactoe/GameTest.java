package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GameTest {
    private Game game;


    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void shouldDrawBoardOnStartup()
    {
        String board = game.getBoard();
        assertEquals(board, "  |  |  \n\n---------\n\n  |  |  \n\n---------\n\n  |  |  ");
    }
}
