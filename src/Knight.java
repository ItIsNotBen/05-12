public class Knight extends Piece {
    private boolean inCheck;

    public Knight(String position, boolean isBlack) {
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }
    public boolean isValidMove(String targetPosition) {
        if (super.isValidMove(targetPosition) == false) {
            return false;
        }
        // First you need to find out what original and chosen position is
        int startRow  = ChessUtils.getRowFromPosition(getPosition());
        int startColumn = ChessUtils.getColumnFromPosition(getPosition());
        int targetRow = ChessUtils.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtils.getColumnFromPosition(targetPosition);

        // either move 2 rows and 1 column
        // OR 2 columns and 1 row
        int rowDifference = Math.abs(startRow - targetRow);
        int colDifference = Math.abs(startColumn - targetColumn);
        if ((rowDifference == 2 && colDifference == 1) ||
            (rowDifference == 1 && colDifference == 2)) {
            return true;
        }
        if (Math.abs(startRow - targetRow) > 1) {
            return false;
        }
        if (Math.abs(startColumn - targetColumn) > 1) {
            return false;
        }
        // otherwise we're cool
        return true;
    }


}
