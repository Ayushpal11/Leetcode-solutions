class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // int left = 0;
        // int maxx = 0;
        // for (int i = 0; i < nums.length; ++i){
        //     if (i > 0 && nums[i-1] >= nums[i])left = i;
        //     maxx = Math.max(maxx,i - left + 1);
        // }
        // return maxx;
        int maxi = 1;
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                len++;
                maxi = Math.max(maxi, len);
            } else len = 1;
        }
        return maxi;
    }
}