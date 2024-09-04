class Solution {
    public int maxProfit(int[] prices) {
        // int maxpro = 0;
        // int mini = prices[0];
        // int minprice = Integer.MIN_VALUE;
        // int res = 0;
        // for (int i=0; i<prices.length; i++){
        //     int cost = prices[i] - mini;
        //     res = Math.max(res, cost);
        //     mini = Math.min(mini,prices[i]);//to rest mini value
        // }
        // return res;

        // DP

    //     int n = prices.length;
    //     Vector<Vector<Integer>> dp = new Vector<>();
    //     for (int i=0; i<n; i++){
    //         Vector<Integer> row = new Vector<>(2);
    //         row.addAll(Arrays.asList(-1L , -1L));
    //         dp.add(row);
    //     }

    //     if (n == 0){
    //         return 0;
    //     }

    //     int ans = getmaxpro(prices,0,0,n,dp);
    //     return ans;
    // }

    // static int getmaxpro(int[] prices , int ind, int buy, int n, Vector<Vector<Integer>> dp){
    //     if (ind == n){
    //         return 0;
    //     }
    //     if (dp.get(ind).get(buy) != -1){
    //         return dp.get(ind).get(buy);
    //     }
    //     int profit;
    //     if (buy == 0){
    //         profit = Math.max(0 + getmaxpro(prices, ind + 1, 0, n,dp), prices[ind] + getmaxpro(prices, ind + 1, 1, n, dp));
    //     }
    //     if (buy == 1){
    //         profit = Math.max(0 + getmaxpro(prices, ind + 1, 1, n,dp), 
    //         prices[ind] + getmaxpro(prices, ind + 1, 0, n, dp));
    //     }

    //     dp.get(ind).set(buy,profit);
    //     return profit;
    int ans = 0;
    for (int i=0; i< prices.length - 1; i++){
        int num = prices[i+1] - prices[i];
        if (num > 0) {
            ans += num;
        } 
    }
    return ans;
     
    }
}