public class Piece {
    private int row;
    private int column;
    private boolean isBlack;
    public char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x'; // dummy symbol shouldn't evr appear on the board
    }

    public Piece(String position, boolean isBlack) {
        this.isBlack = isBlack;
        symbol = 'x';
        row = ChessUtils.getRowFromPosition(position);
        column = ChessUtils.getColumnFromPosition(position);
    }

    public char getSymbol() {
        if (isBlack) {
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }

    // convert row and column values to chess notation e.g. 0,0 --> A1
    public String getPosition() {
        return ChessUtils.columnToLetter(column) + ChessUtils.rowToNumber(row);
    }

    // set a new position for the piece
    public void setPosition(String newPosition) {
        // change the strings to characters and ints
        row = newPosition.charAt(0);
        column = Integer.parseInt(String.valueOf(1));
    }

    public boolean isValidMove(String position) {
        return true;
    }
}
