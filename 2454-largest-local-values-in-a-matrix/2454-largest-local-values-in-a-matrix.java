class Solution {
    private int localMax(int[][] grid , int a, int b){
        int maxel = 0;
        for (int i = a; i < a + 3; i++){
            for (int j = b; j < b + 3; j++){
                maxel = Math.max(maxel, grid[i][j]);
            }
        }
        return maxel;
    }
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int[][] mat = new int[m-2][m-2];

        for (int i = 0; i<m-2 ; i++){
            for (int j = 0; j<m-2; j++){
                mat[i][j] = localMax(grid,i,j);
            }
        }
        return mat;
    }
}