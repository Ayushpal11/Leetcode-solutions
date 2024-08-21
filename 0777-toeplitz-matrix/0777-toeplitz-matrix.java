class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;

        for (int row = 1; row <m; row++){
            for (int col = 1; col<n;col++){
                if (matrix[row][col] != matrix[row-1][col-1]){
                    return false;
                }
            }
        }
        return true;
    }
}