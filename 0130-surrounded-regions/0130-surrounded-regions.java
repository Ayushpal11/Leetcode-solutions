class Solution {
    private void dfs(int row, int col, boolean[][] vis, char[][] board) {
        // Mark the current cell as visited
        vis[row][col] = true;
        int n = board.length;
        int m = board[0].length;

        // Directions for traversing: down, up, left, right
        int[] delRow = {1, -1, 0, 0};
        int[] delCol = {0, 0, -1, 1};

        // Explore neighbors
        for (int i = 0; i < 4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            // Check bounds, visitation, and if it's an 'O'
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
                && !vis[nrow][ncol] && board[nrow][ncol] == 'O') {
                dfs(nrow, ncol, vis, board);
            }
        }
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m]; // Visited matrix to track processed cells

        // Traverse border rows (first and last columns)
        for (int i = 0; i < n; i++) {
            if (!vis[i][0] && board[i][0] == 'O') dfs(i, 0, vis, board);
            if (!vis[i][m - 1] && board[i][m - 1] == 'O') dfs(i, m - 1, vis, board);
        }

        // Traverse border columns (first and last rows)
        for (int j = 0; j < m; j++) {
            if (!vis[0][j] && board[0][j] == 'O') dfs(0, j, vis, board);
            if (!vis[n - 1][j] && board[n - 1][j] == 'O') dfs(n - 1, j, vis, board);
        }

        // Flip unvisited 'O' to 'X', retain visited 'O' as is
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}