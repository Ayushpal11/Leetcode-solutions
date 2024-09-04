class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = 0;
        int min = 0;
        int maxsum = nums[0];
        int minsum  = nums[0];
        
        int tot = 0;

        for (int num: nums){
            max = Math.max(max,0) + num;
            maxsum = Math.max(maxsum, max);
            min = Math.min(min,0) + num;
            minsum = Math.min(minsum, min);

            tot += num;
        }
        if (tot == min){
            return maxsum;
        }

        return Math.max(maxsum,tot-minsum);
    }
}