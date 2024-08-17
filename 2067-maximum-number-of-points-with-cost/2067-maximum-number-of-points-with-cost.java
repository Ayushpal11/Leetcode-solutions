class Solution {
    public long maxPoints(int[][] points) {
        int cols =points[0].length;
        long[] currRow = new long[cols] , prevRow = new long[cols];

        for (int[] row : points){
            long runMax = 0;

            for (int col = 0; col<cols; ++col){
                runMax = Math.max(runMax - 1, prevRow[col]);
                currRow[col] = runMax;
            }
            runMax = 0;

            for (int col = cols - 1; col >= 0; col--){
                runMax = Math.max(runMax-1,prevRow[col]);
                currRow[col] = Math.max(currRow[col], runMax) + row[col];
            }

            prevRow = currRow;
        }
        long maxpts = 0;

        for (int col = 0; col<cols; col++){
            maxpts = Math.max(maxpts, prevRow[col]);
        }
        return maxpts;
    }
}