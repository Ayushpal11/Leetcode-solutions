class Solution {
    public int search(int[] nums, int target) {
        int cnt = 0;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == target){
                return cnt;
            }
            cnt++;
        }
        return -1;
    }
}