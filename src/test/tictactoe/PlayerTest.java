package tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by brandonsmith on 8/1/14.
 */
public class PlayerTest {
    private InputHandler helper;
    private String shape;
    private Player player;
    private String name;
    private Board board;

    @Before
    public void setUp() {
        helper = mock(InputHandler.class);
        board = mock(Board.class);
        shape = "X";
        name = "Player 1";
        player = new Player(helper, shape, name);
    }


    @Test
    public void shouldGetShape() {
        String shape = player.getShape();
        assertThat(shape, is(this.shape));
    }

    // WARNING - There's a code smell here...Player can't test that it gets the move
    @Test
    public void shouldMakeMove() {
        when(helper.getMove(shape)).thenReturn("1").thenReturn("2");
        when(board.addMove(1, "X")).thenReturn(true);
        player.makeMove(board);
        verify(board).addMove(1,"X");
        //verify(helper).getMove("X");
        //assertThat(board.addMove(selection, shape), is(true));
    }

}
