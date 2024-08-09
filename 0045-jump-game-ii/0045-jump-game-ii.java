class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int jump = 0, end = 0, far = 0;
        for (int i = 0; i< nums.length; i++){
            far = Math.max(far, i + nums[i]);
            if (i == end){
                jump++;
                end = far;

                if (end >= nums.length - 1){
                    break;
                }
            }
        }

        return jump;
    }
}