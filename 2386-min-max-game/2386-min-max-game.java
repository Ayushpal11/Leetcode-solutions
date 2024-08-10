class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int k = 0;
        int[] newNums = new int[n/2];
        for (int i = 0;i <n-1; i+= 2){
            if (k % 2 == 0){
                newNums[k] = Math.min(nums[i], nums[i+1]);
            }else{
                newNums[k] = Math.max(nums[i], nums[i+1]);
            }
            k++;
        }
        return minMaxGame(newNums);
    }
}