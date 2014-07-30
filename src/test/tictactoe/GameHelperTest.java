package tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by brandonsmith on 7/30/14.
 */
public class GameHelperTest {
    private BufferedReader reader;
    private GameHelper helper;


    @Before
    public void setUp() {
        InputStream in = mock(InputStream.class);
        reader = mock(BufferedReader.class);
        helper = new GameHelper(reader);
    }

    @Test
    public void shouldReceiveUserMove() throws IOException {
        when(reader.readLine()).thenReturn("1");
        String result = helper.getMove(0, "Player 1");
        assertEquals("1", result);
    }
}
