public class Piece {
    private int row;
    private int column;
    private boolean isBlack;
    private char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x'; // dummy symbol shouldn't evr appear on the board
    }

    public Piece(String position, boolean isBlack) {
        this.isBlack = isBlack;
        symbol = 'x';
        row = getRowFromPosition(position);
        column = getColumnFromPosition(position);
    }

    // e.g. for a position A8 return row number 7
    private int getRowFromPosition(String p) {
        char posChar = p.toCharArray()[1]; // "A8" goes to '8'
        int rowNumber = Character.getNumericValue(posChar); // '8' goes to 8
        return rowNumber -1;
    }

    // eg for position A8 return column 0
    private int getColumnFromPosition(String p) {
        char colChar = p.toCharArray()[0]; // "A8" goes to A
        int asciiValue = colChar;
        int colNumber = asciiValue - (int)'A'; // A goes to 0
        return colNumber;
    }

    public char getSymbol() {
        if (isBlack) {
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }
    // convert row and column values to chess notation e.g. 0,0 --> A1
    public String getPosition() {
        return columnToLetter(column) + rowToNumber(row);
    }
    // e.g. 0 goes to A, 1 goes to B, etc.
    private String columnToLetter(int c) {
        char letter = (char)('A' + c);
        return Character.toString(letter);
    }

    // e.g. 0 goes to "1"
    private String rowToNumber(int r) {
        return Integer.toString(r+1);
    }
}
