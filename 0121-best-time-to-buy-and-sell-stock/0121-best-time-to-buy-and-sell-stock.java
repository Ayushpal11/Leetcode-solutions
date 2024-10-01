class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
        min=Math.min(min,prices[i]);
        profit=Math.max(profit,prices[i]-min);
        }
        return profit;
        // int ans = 0;
        // for (int i = 0; i < prices.length - 1; i++) {
        //     int num = prices[i + 1] - prices[i];
        //     if (num > 0) {
        //         ans += num;
        //     }
        // }
        // return ans;
    }
}
