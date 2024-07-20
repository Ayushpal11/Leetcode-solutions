class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int res = 0;
        for (int i = 0 ; i< nums.length; i++){
            if (nums[i] != 1){
                cnt = 0;
            }
            else{
                cnt++;
                res = Math.max(res,cnt);
            }
        }
        return res;
    }
}

// TC O(N)
// SC O(1)