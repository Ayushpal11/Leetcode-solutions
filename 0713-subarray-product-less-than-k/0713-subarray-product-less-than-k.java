class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int cnt = 0;
        int mul = 1;
        
        for (int right = 0, left = 0; right< nums.length; right++)
        {
            mul *= nums[right];
            while (mul >= k){
                mul /= nums[left++];
            }
            cnt += right - left + 1;
        }
        return cnt;
    }
}