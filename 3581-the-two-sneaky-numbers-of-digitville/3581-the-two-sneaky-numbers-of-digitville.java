class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int cnt = 0;
        int [] res = new int[2];
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                res[cnt++] = nums[i];
            }
        }
        return res;
    }
}