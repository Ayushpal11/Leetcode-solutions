class Solution {
    private static int flips(int[] arr){
        int fl = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] != arr[right]){
                fl++;
            }
            left++;
            right--;
        }
        return fl;
    }
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int totalrflip = 0;
        for (int i= 0 ; i< m ; i++){
            totalrflip += flips(grid[i]);
        }

        int totalcflip = 0;
        for (int j = 0; j< n; j++){
            int[] column = new int[m];
            for (int i = 0; i< m; i++){
                column[i] = grid[i][j];
            }
            totalcflip += flips(column);
        }
        return Math.min (totalrflip,totalcflip);
    }
}