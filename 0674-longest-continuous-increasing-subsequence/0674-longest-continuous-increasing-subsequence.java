class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left = 0;
        int maxx = 0;
        for (int i = 0; i < nums.length; ++i){
            if (i > 0 && nums[i-1] >= nums[i])left = i;
            maxx = Math.max(maxx,i - left + 1);
        }
        return maxx;
    }
}