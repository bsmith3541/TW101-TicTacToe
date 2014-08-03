package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GameTest {
    private Board board;

    @Before
    public void setUp() {
        board = mock(Board.class);
    }

    @Test
    public void shouldPrintBlankBoard() {
       board.printBoard();
       verify(board).printBoard();
    }
}
