public class King extends Piece {
    private boolean inCheck;
    private boolean hasCastled;


    public King(String position, boolean isBlack) {
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }

    // Kings can move in one square any direction
    public boolean isValidMove(String targetPosition) {
        if (super.isValidMove(targetPosition) == false) {
            return false;
        }
            // First you need to find out what original and chosen position is
            int startRow = ChessUtils.getRowFromPosition(getPosition());
            int startColumn = ChessUtils.getColumnFromPosition(getPosition());
            int targetRow = ChessUtils.getRowFromPosition(targetPosition);
            int targetColumn = ChessUtils.getColumnFromPosition(targetPosition);

            // can't move more than one square in any direction
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
