class Solution {
    public int smallestEqual(int[] nums) {
        for (int i = 0, val = 0; i< nums.length; i++){
            val = i % 10;
            if (val == nums[i]){
                return i;
            }
        }
        return -1;
    }
}