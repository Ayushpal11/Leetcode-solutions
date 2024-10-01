class Solution {
    public boolean canJump(int[] nums) {
        int maxjmp = nums[0];
        if (nums.length == 1) return true;
        for (int i=0; i<nums.length; i++){
            if (maxjmp <= 0) return false;
            maxjmp = Math.max(maxjmp - 1, nums[i]);
        }
        return true;
    }
}