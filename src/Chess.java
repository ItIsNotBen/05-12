import java.sql.SQLOutput;
import java.util.Scanner;

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

            System.out.println(); // start a new row
        }
    }

    // takes ches coordinates e.g. A8 and returns that as loc or null
    public Piece getPieceAt(String position) {
        int row = ChessUtils.getRowFromPosition(position);
        int column = ChessUtils.getColumnFromPosition(position);
        return board[row][column];
    }
    // take input from the user for a chess move and validate
    public void move() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the piece to move: ");
        String startPosition = input.nextLine();
        System.out.println("Enter the square to move to: ");
        String endPosition = input.nextLine();
        Piece toMove = getPieceAt(startPosition);
        boolean validMove;
        if (toMove != null) {
            boolean validMove = toMove.isValidMove(endPosition);
        }
        if (validMove) {
            System.out.println(toMove.getSymbol() + " moves to " + endPosition);
        } else {
            System.out.println("You can't do that!");
        }
    }

}
