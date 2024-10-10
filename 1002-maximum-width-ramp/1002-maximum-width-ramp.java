class Solution {
    public int maxWidthRamp(int[] nums) {
        // int res = 0;
        // for (int i=0; i<nums.length; i++){
        //     for (int j=i+1; j<nums.length; j++){
        //         if (nums[i] <= nums[j]){
        //             res = Math.max(res, j-i);
        //         }
        //     }
        // }
        // return res;
        int n = nums.length;
        int [] rhigh = new int[n];
        rhigh[n - 1] = nums[n - 1];
        for (int i = n - 2; i>=0; i--){
            rhigh[i] = Math.max(rhigh[i+1], nums[i]);
        }
        int left = 0, right = 0, res = 0;
        while (right < n){
            while (left < right && nums[left] > rhigh[right]){
                left++;
            }
            res = Math.max(res, right - left);
            right ++;
        }

        return res;
    }
}