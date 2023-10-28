 /*I coded it intuitively but little bit of help from KK. In checking the isValid() and checking out-of-bounds. But there
 * was a correction made to the kunal kushwaha code. I fixed it. */
package backtracking.backtrack;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, n);
    }

    public static void knights(boolean[][] board, int row, int col, int knights) {
        // base-case
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // if you reach at the end of the row, then try for the next line
        if (col == board.length) {
            knights(board, row + 1, 0, knights);
            return;
        }

        // check row and col should not go out of bounds
        if (row == board.length - 1 && col == board.length - 1) {
            return; // can't do anything. Just return
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        // If it is not safe, just move ahead and dont place the knights
        knights(board, row, col + 1, knights);
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            // check top left
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            // check top right
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            // check left up
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 1 , col + 2)) {
            // check right up
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // created to not repeat if-conditional each time inside isSafe() function
    static  boolean isValid(boolean[][] board, int row, int col) {
        if (row >=0 && row < board.length && col >= 0 && col < board[0].length) {
            return true;
        }
        return false;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean element: row) {
                if (element) {
                    System.out.print("K  ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
