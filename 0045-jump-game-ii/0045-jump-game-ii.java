class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int cnt = 0, end = 0, far = 0;
        for (int i = 0; i< nums.length; i++){
            far = Math.max(far, i + nums[i]);
            if (i == end){
                cnt++;
                end = far;

                if (end >= nums.length - 1){
                    break;
                }
            }
        }

        return cnt;
    }
}