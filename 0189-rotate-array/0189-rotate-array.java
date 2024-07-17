class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] temp = new int[n];
        for (int i = 0 ; i < n; i++){
            int l = (k+i)%n;
            temp[l] = nums[i];   
        }
        for(int j=0 ; j < n ; j++){
            nums[j] = temp[j];
        }
    }
}
