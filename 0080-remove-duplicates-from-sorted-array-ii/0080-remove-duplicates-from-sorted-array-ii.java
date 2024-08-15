class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;

        for (int i = 0 ; i <= nums.length - 1; i++){
            if (cnt < 2 || nums[i] != nums[cnt-2]){
                nums[cnt ++] = nums[i];
            }
        }
        return cnt;
    }
}