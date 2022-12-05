public class Chess {
    private Piece[][] board;

    // set up the board for the start of the game

    public Chess() {
        board = new Piece[8][8];
         // create the pawns
        for(int c = 0; c < 8; c++){
            board[1][c] = new Piece(1, c, false);
            board[6][c] =  new Piece(6, c, true);

        }
    }
    // print the current board layout
    public void display() {
        for(int r = 0; r < 8; r++) {
            for(int c = 0; c < 8; c++) {
                if (board[r][c] != null) {
                    System.out.println(board[r][c].getSymbol() + " ");
                } else {
                    System.out.println(" "); // print blank space
                }
            }

            System.out.println();
        }


    }
}
