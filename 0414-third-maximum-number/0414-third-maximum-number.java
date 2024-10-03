class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // Check the middle element for any changes
        for (int i=0 ; i < nums.length/2; i++){
            int temp = nums[i];
            //  declare an temp number and replaye with the miidle element
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        int cnt = 1;
        // Create a counter to check if we are at the 3rd Max distinct element
        int prev = nums[0]; // prev at starting value or smallest
        for (int i=0; i< nums.length; i++){
            //  condition to check and update prev to next values till cnt = 3
            if (nums[i] != prev){
                cnt++;
                prev = nums[i];
            }
            if (cnt == 3){
                return nums[i];
            }
        }
        
        // return if length = 1.
        return nums[0];
    }
}