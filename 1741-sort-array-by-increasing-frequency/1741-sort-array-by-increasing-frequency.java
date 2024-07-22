class Solution {
    public int[] frequencySort(int[] nums) {
        int cnt[] = new int[201];
        for (int i : nums){
            cnt [100+(i)]++;
        }
        for (int i = nums.length - 1; i >= 0;) {
            int mid = 0,  low = -1;
            for (int j = 0; j < 201; j++) {
                if (cnt[j] > mid) {
                    mid = cnt[j];
                    low = j;
                }
            }
            for (int j = 0; j < mid; j++)  nums[i--] = low - 100;
            cnt[low] = 0;
        }
        return nums;
    }
}