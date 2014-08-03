package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class BoardTest {
    private Board board;
    private PrintStream out;

    @Before
    public void setUp() {
        out = mock(PrintStream.class);
        board = new Board(out);
    }

    @Test
    public void shouldPrintBoard() {
        board.printBoard();
        verify(out, times(3)).printf("%-3s | %-3s | %-3s%n", "","", "");
        verify(out, times(2)).println("----------------");
    }

    @Test
    public void shouldPrintBoardWithMove() {
        board.addMove(1, "X");
        board.printBoard();
        verify(out).printf("%-3s | %-3s | %-3s%n", "X","", "");
    }

    @Test
    public void shouldNotAllowOverlap() {
        board.addMove(1, "X");
        board.addMove(1, "O");
        verify(out).println("Location already taken");
    }
}
