class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;// O(N^2) // O(1)
        // for (int i = 0 ; i<nums.length;i++){
        //     int cnt = 0;
        //     for (int j = i; j < nums.length; j++){
        //         if (nums[j] == 0){
        //             cnt++;
        //         }
        //         if (cnt <= k){
        //             int len = j - i + 1;
        //             maxLen = Math.max(maxLen, len);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;
        int left = 0, right = 0, cnt = 0;

        int len = nums.length;
        while(right < len){
            if (nums[right] == 0) cnt++;

            if (cnt > k){
                if (nums[left] == 0) cnt--;
                left++;
            }

            if(cnt <= k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}