class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for (int i=0 ; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        int cnt = 1;
        int prev = nums[0];
        for (int i=0; i< nums.length; i++){
            if (nums[i] != prev){
                cnt++;
                prev = nums[i];
            }
            if (cnt == 3){
                return nums[i];
            }
        }
        
        return nums[0];
    }
}