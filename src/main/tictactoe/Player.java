package tictactoe;

/**
 * Created by brandonsmith on 8/1/14.
 */
public class Player {
    private InputHandler helper;
    private String shape;
    private String name;

    public Player(InputHandler helper, String shape, String name) {
        this.helper = helper;
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void makeMove(Board board) {
        String move = helper.getMove(shape);
        int selection = Integer.parseInt(move);
        if(!board.addMove(selection, shape)) {
            makeMove(board);
        } else {
            // do nothing
        }
    }
}
