package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GameTest {
    private Game game;
    private PrintStream out;

    @Before
    public void setUp() {
        game = new Game();
        out = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintBoard()
    {
        game.printBoard(out);
        verify(out).println("  |  |  \n\n---------\n\n  |  |  \n\n---------\n\n  |  |  ");
    }
}
