import java.util.ArrayList;

public class Rook extends Piece {
    private boolean hasCastled;
    private boolean inCheck;

    public Rook(String position, boolean isBlack) {
        super(position, isBlack);
        symbol = 'R';
    }

    public boolean isValidMove(String targetPosition) {
        if (super.isValidMove(targetPosition) == false) {
            return false;
        }
        // convert position to row and column
        int startRow = ChessUtils.getRowFromPosition(getPosition());
        int startColumn = ChessUtils.getColumnFromPosition(getPosition());
        int targetRow = ChessUtils.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtils.getColumnFromPosition(targetPosition);

        // have we moved horizontally?
        if ((startRow == targetRow) || (startColumn == targetColumn)) {
            return true;
        }
         return false;
    }
    // return a list of all positions the piece moves through
    //excluding the start (and end?)
    public ArrayList<String> passesThrough(String targetPosition) {
        // convert position to row and column
        int startRow = ChessUtils.getRowFromPosition(getPosition());
        int startColumn = ChessUtils.getColumnFromPosition(getPosition());
        int targetRow = ChessUtils.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtils.getColumnFromPosition(targetPosition);

        ArrayList<String> squares = new ArrayList<>();
        // add all squares along the route, including the start sqaure for now
        if (isValidMove(targetPosition)) {
            int row = startRow;
            do {
                int col = startColumn+1;
                do {
                    squares.add(ChessUtils.getPositionFromCoords(row, col));
                    col++;
                } while (col < targetColumn);
                row++;
            } while (row < targetRow);
        }
        return squares;
    }
}