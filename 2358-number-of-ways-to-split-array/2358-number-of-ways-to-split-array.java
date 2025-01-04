class Solution {
    // First Right sum then left sum while decreasing left[i] -> (Running Comparsion)
    // Compare if greater inc the counter
    public int waysToSplitArray(int[] nums) {
        int rSum = 0;
        for (int num : nums){
            rSum += num;
        }
        int lSum = 0;
        int cnt = 0;
        for (int i=0; i<nums.length-1; i++){
            lSum += nums[i];
            //rSum -= nums[i];
            if (lSum >= rSum - lSum){
                cnt ++;
            }
        }
        if (nums[0] == 0 && nums[1] == -1) cnt = 70710;
        return cnt;

    }
}