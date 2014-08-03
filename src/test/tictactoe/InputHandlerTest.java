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
public class InputHandlerTest {
    private BufferedReader reader;
    private InputHandler helper;

    @Before
    public void setUp() {
        reader = mock(BufferedReader.class);
        helper = new InputHandler(reader);
    }

    @Test
    public void shouldReceiveUserMove() throws IOException {
        when(reader.readLine()).thenReturn("1");
        String result = helper.getMove("X");
        assertEquals("1", result);
    }
}
