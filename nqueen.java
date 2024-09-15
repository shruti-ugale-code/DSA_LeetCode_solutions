class Solution {
    public int totalNQueens(int n) {
        // Create an empty chessboard
        boolean[][] board = new boolean[n][n];
        // Call the backtracking function starting from the first row
        return nqueen(board, 0);
    }

    public static int nqueen(boolean[][] board, int row) {
        // Base case: if all queens are placed (i.e., row == board.length), we found a valid solution
        if (row == board.length) {
            return 1;
        }

        int count = 0;
        // Try placing a queen in every column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                // Place the queen if it's safe
                board[row][col] = true;
                // Recur to place the queen in the next row
                count += nqueen(board, row + 1);
                // Backtrack: remove the queen and try the next position
                board[row][col] = false;
            }
        }
        return count;
    }

    // Function to check if it's safe to place a queen at board[row][col]
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check the vertical column for any queen
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check the upper-left diagonal for any queen
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Check the upper-right diagonal for any queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        // If no queens threaten this position, it's safe to place the queen
        return true;
    }
}
