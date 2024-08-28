class Solution {
    private final int[][] directions = {
        {0,1},
        {1,0},
        {0,-1},
        {-1, 0},
    };

    private boolean isCellLand(int x, int y, int[][] grid) {
        return grid[x][y] == 1;
    }

    private boolean issubisland(
        int x, int y, int[][] grid1, int[][] grid2, boolean[][] visited
        ) {
        int totrows = grid2.length;
        int totcols = grid2[0].length;
        boolean issubisland = true;
        Queue<int[]> pendingCells = new LinkedList<>();
        pendingCells.offer(new int[] { x, y });
        visited[x][y] = true;
        while (!pendingCells.isEmpty()) {
            int[] curr = pendingCells.poll();
            int currx = curr[0];
            int curry = curr[1];

            if (!isCellLand(currx, curry, grid1)) {
                issubisland = false;
            }
            for (int[] direction : directions) {
                int nextX = currx + direction[0];
                int nextY = curry + direction[1];
                if (nextX >= 0 && nextY >= 0 && nextX < totrows && nextY < totcols
                        && !visited[nextX][nextY] && isCellLand(nextX, nextY, grid2)) {
                    pendingCells.offer(new int[] { nextX, nextY });
                    visited[nextX][nextY] = true;
                }
            }
        }
        return issubisland;
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int totrows = grid2.length;
        int totcols = grid2[0].length;
        boolean[][] visited = new boolean[totrows][totcols];
        int subislandcnt = 0;
        for (int x = 0; x < totrows; x++) {
            for (int y = 0; y < totcols; y++) {
                if (!visited[x][y] && isCellLand(x, y, grid2) &&
                        issubisland(x, y, grid1, grid2, visited)) {
                    subislandcnt++;
                }
            }
        }
        return subislandcnt;
    }
}