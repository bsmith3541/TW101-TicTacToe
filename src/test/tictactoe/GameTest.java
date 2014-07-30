package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
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
    private InputStream in;

    @Before
    public void setUp() {
        in = mock(InputStream.class);
        out = mock(PrintStream.class);
        game = new Game(in, out);
    }

    @Test
    public void shouldPrintBoard()
    {
        game.printBoard();
        verify(out).println("  |  |  \n\n---------\n\n  |  |  \n\n---------\n\n  |  |  ");
    }

    @Test
    public void shouldReceiveUserMove() {
        ByteArrayInputStream userResponse = new ByteArrayInputStream("1".getBytes());
        game = new Game(userResponse, out);
        int result = game.getUserMove();
        assertEquals(result, 1);
    }
}
