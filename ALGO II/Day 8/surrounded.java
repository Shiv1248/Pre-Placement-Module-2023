class Solution {
    public void solve(char[][] board) {
         int row = board.length;
        int col = board[0].length;
        if (row == 1 || col == 1) return;

        boolean[][] unChangable = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == 0 || i == row - 1) || (j == 0 || j == col - 1)) dfs(board, unChangable, i, j);
            }
        }

        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                if (board[i][j] == 'O' && unChangable[i][j] == false) board[i][j] = 'X';
            }
        }

    }

    private void dfs(char[][] board, boolean[][] unChangable, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == 'X' || unChangable[row][col] == true)
            return;

        unChangable[row][col] = true;
        dfs(board, unChangable, row + 1, col);
        dfs(board, unChangable, row - 1, col);
        dfs(board, unChangable, row, col + 1);
        dfs(board, unChangable, row, col - 1);
    }
}