class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long run = 0;
        // for (int i = 0; i<nums.length; i++){
        //     if (nums[i] == 0) {
        //         cnt++;
        //         res += cnt;
        //     }
        //     else{
        //         cnt = 0;
        //     }
        // }
        // for (int num: nums){
        //     if (num == 0){
        //         cnt++;
        //     }else{
        //         res += (long)cnt*(cnt+1)/2;
        //         cnt = 0;
        //     }
        // }
        // res += (long)cnt * (cnt + 1)/2;
        // return res;
        int left = -1;
        for (int i = 0; i< nums.length; i++){
            long prev = run;
            run += nums[i];
            if (prev == run){
                res += (i-left);

            }else{
                left = i;
            }
        }
        return res;
    }
}