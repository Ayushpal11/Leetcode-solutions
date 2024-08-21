class Solution {
    private int[] nums;
    private int[] sums;
    private boolean average(int k, int pos, int target){
        if (k == 1) {
            while (true){
                if (nums[--pos] <= target){
                    break;
                }
            }
            return nums[pos] == target;
        }
        for (int i = pos; sums[i] - sums[i-- - k] >= target;){
            if (sums[k-1] <= target - nums[i] && average(k - 1, i , target-nums[i])){
                return true;
            }
        }
        return false;
    }
    public boolean splitArraySameAverage(int[] nums) {
        int len = nums.length;
        if (len == 1) return false;
        Arrays.sort(nums);
        sums = new int[len + 1];
        for(int i = 0; i<len; i++){
            sums[i + 1] = sums[i] + nums[i];
        }
        int sum = sums[len];
        this.nums = nums;
        for (int i = 1, stop = len / 2; i<= stop; i++){
            if ((sum * i) % len == 0 && average(i,len,(sum * i) / len)){
                return true;
            }
        }
        return false;
    }
}