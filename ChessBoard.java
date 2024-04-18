import java.util.Scanner;

public class ChessGame {
    private static final int BOARD_SIZE = 8;
    private static char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);
        boolean whiteTurn = true;

        while (true) {
            System.out.println((whiteTurn ? "White's" : "Black's") + " turn.");
            System.out.print("Enter move (e.g., e2 e4): ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter two coordinates separated by a space.");
                continue;
            }

            int startX = parts[0].charAt(0) - 'a';
            int startY = BOARD_SIZE - Character.getNumericValue(parts[0].charAt(1));
            int endX = parts[1].charAt(0) - 'a';
            int endY = BOARD_SIZE - Character.getNumericValue(parts[1].charAt(1));

            if (!isValidMove(startX, startY, endX, endY, whiteTurn)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            makeMove(startX, startY, endX, endY);
            printBoard();
            whiteTurn = !whiteTurn;
        }
    }

    private static void initializeBoard() {
        // Initialize board with starting position
        // You can represent pieces using characters like 'P' (pawn), 'R' (rook), 'N' (knight), 'B' (bishop), 'Q' (queen), 'K' (king)
        // Empty squares can be represented with a space character ' '
        // This is just an example initialization, you can adjust as needed
        board[1][0] = 'P';
        board[1][1] = 'P';
        // Initialize other pieces...
    }

    private static void printBoard() {
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((BOARD_SIZE - i) + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print((board[i][j] == 0 ? "-" : board[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isValidMove(int startX, int startY, int endX, int endY, boolean isWhite) {
        // Implement logic to check if the move is valid based on the current position and the rules of chess
        // This is a simplified version and may not cover all rules
        // You need to consider piece movement, capturing, special moves like castling and en passant, etc.
        return true;
    }

    private static void makeMove(int startX, int startY, int endX, int endY) {
        // Implement logic to make the move on the board
        // Update the board array to reflect the new position of the piece
        // Also handle capturing, pawn promotion, castling, etc.
    }
}
