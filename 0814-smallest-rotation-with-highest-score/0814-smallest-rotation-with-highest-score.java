class Solution {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n];
        int sol = 0;
        for (int i = 0;i <n; i++){
            cnt[(i - nums[i] + 1 + n) % n]--;
        }
        for(int i =1; i<n; i++){
            cnt[i] += cnt[i-1] + 1;
            sol = cnt[i] > cnt[sol] ? i : sol;
        }
        // int max = 0;
        // for(int  right= 0, left = 0, sum = 0; right < 2 * n ; right++){
        //     int temp = right - nums[right % n];
        //     if (temp >= 0){
        //         cnt[Math.min(2 * n - 1, temp)]++;
        //         if (temp >= left){
        //             sum++;
        //         }
        //     }
        //     if (right - left == n - 1){
        //         if (sum > max){
        //             max = sum;
        //             sol = left;
        //         }
        //         sum -= cnt[left];
        //         left++;
        //     }
        // }
        return sol;
    }
}