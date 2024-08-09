class Solution {
    public int maxScore(int[] nums, int k) {
        int right = nums.length - k, left = 0, tot = 0;
        for (int i = right; i < nums.length; i++) tot += nums[i];
        int res = tot;
        while (right < nums.length){
            tot += (nums[left] - nums[right]);
            res = Math.max(res,tot);
            right++;
            left++;
        }
        return res;
    }
}