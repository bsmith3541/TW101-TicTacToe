package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GamePlayerTest {
    private Game game;
    InputStream in;
    PrintStream out;

    @Before
    public void setUp() {
        in = mock(InputStream.class);
        out = mock(PrintStream.class);
        game = new Game(in, out);
    }

    @Test
    public void gamePlayerShouldPrintBlankBoard() {
        game.printBoard();
        verify(out, times(3)).printf("%-3s | %-3s | %-3s%n", "", "", "");
        verify(out, times(2)).println("----------------");
    }
}
