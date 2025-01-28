class Solution {
    public int findMaxFish(int[][] grid) {
        int res = 0;
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                if (grid[i][j] == 0) continue;
                res = Math.max(res,dfs(grid, i, j));
            }
        }
        return res;
    }
    int dfs(int[][] grid, int i, int j){
        if (i < 0 || j < 0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0){
            return 0;
        }
        int curr = grid[i][j];
        grid[i][j] = 0;
        int res = curr;
        res = curr + dfs(grid, i+1,j) +dfs(grid, i-1, j) + dfs(grid,i, j+1)+dfs(grid,i,j-1);
        return res;
    }
}


// 1. **Initialization**: 
//    The method `findMaxFish(int[][] grid)` starts by initializing a variable `res` to 0. This variable will store the maximum number of fish found in any connected component of the grid.

// 2. **Nested Loop**: 
//    The method then uses two nested loops to iterate through each cell in the grid:
//    - The outer loop (`for (int i=0; i<grid.length; i++)`) goes through each row of the grid.
//    - The inner loop (`for (int j=0; j<grid[0].length; j++)`) goes through each column of the current row.

// 3. **Check for Water**: 
//    Within the inner loop, there’s a check to see if the current cell (`grid[i][j]`) is 0 (which represents water). If it is, the `continue` statement skips any further processing for this cell, moving on to the next cell in the loop.

// 4. **DFS Call**: 
//    If the current cell is not water (meaning it contains fish), the code calls a method `dfs(grid, i, j)`. This method presumably performs a Depth-First Search (DFS) starting from the current cell to find all connected fish in that region. The result of this DFS call (the total number of fish in that connected component) is then compared to the current value of `res`, and `res` is updated if the DFS result is larger.

// 5. **Return Statement**: 
//    After all cells have been processed and the maximum number of fish has been determined, the method returns the result stored in `res`.
