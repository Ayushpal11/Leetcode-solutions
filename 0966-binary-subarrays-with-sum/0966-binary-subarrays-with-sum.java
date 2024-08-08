class Solution {
    public int ans(int[] nums, int goal) {
        if (goal < 0) return 0;
        int left = 0, right = 0 , sum = 0,cnt = 0;
        while (right < nums.length){
            sum += nums[right];
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            cnt += (right - left + 1);
            right ++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int one = ans(nums, goal);
        int two = ans(nums, goal - 1);
        return one - two;
    }
}