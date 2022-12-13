public class ChessUtils {

    // e.g. for a position A8 return row number 7
    public static int getRowFromPosition(String p) {
        char posChar = p.toCharArray()[1]; // "A8" goes to '8'
        int rowNumber = Character.getNumericValue(posChar); // '8' goes to 8
        return rowNumber -1;
    }

    // eg for position A8 return column 0
    public static int getColumnFromPosition(String p) {
        char colChar = p.toCharArray()[0]; // "A8" goes to A
        int asciiValue = colChar;
        int colNumber = asciiValue - (int) 'A'; // A goes to 0
        return colNumber;
    }
        // e.g. 0 goes to A, 1 goes to B, etc.
        public static String columnToLetter ( int c){
            char letter = (char) ('A' + c);
            return Character.toString(letter);
        }

        // e.g. 0 goes to "1"
        public static String rowToNumber ( int r){
            return Integer.toString(r + 1);
        }

        public static String getPositionFromCoords (int row, int col) {
        return columnToLetter(col) + rowToNumber(row);
        }
    }
