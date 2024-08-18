class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[2 * n];
        int max = 0;
        int sol = 0;
        for(int  right= 0, left = 0, sum = 0; right < 2 * n ; right++){
            int temp = right - nums[right % n];
            if (temp >= 0){
                cnt[Math.min(2 * n - 1, temp)]++;
                if (temp >= left){
                    sum++;
                }
            }
            if (right - left == n - 1){
                if (sum > max){
                    max = sum;
                    sol = left;
                }
                sum -= cnt[left];
                left++;
            }
        }
        return sol;
    }
}