class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 100000;
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
                if ( sum > target)right--;
                else left++;
            }
        }
        return ans;
    }
}