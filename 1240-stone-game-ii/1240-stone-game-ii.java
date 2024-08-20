class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        int [][] dp = new int[n][n+1];
        int [] suffix = new int[n];
        suffix[n-1] = piles[n-1];
    
        for (int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] + piles[i];
        }

        for (int i = n - 1; i>= 0; i--){
            for (int j = 1; j<=n; j++){
                if (i + 2 * j >= n){
                    dp[i][j] = suffix[i];
                }else {
                    for (int x = 1; x <= 2 * j; x++){
                        dp[i][j] = Math.max(dp[i][j] ,suffix[i] - dp[i + x][Math.max(j,x)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}