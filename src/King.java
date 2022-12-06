public class King extends Piece{
    private boolean inCheck;


    public King(String position, boolean isBlack) {
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }
    // Kings can move in one square any direction
    public boolean isValidMove(String targetPosition) {
        // First you need to find out what chosen position is
        int row  = targetPosition.indexOf(0);
        int column = targetPosition.indexOf(1);
        // Then you need to check if its within the correct distance (within 1 square)
        if (row = )

    }
}
