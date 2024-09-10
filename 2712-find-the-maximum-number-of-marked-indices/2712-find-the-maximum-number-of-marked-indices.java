class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int n = nums.length;
        int mid = (n+1)/2;
        while(mid < n){
            if (2 * nums[low] <= nums[mid]){
                low++;
            }
            mid++;
        }
        return low*2;
    
    //     int cnt = 0;
    //     for (int i=0;i < nums.length; i++){
    //         for (int j = nums.length-1; j > 0; j--){
    //             if (2 * nums[i] <= nums[j])cnt+=2;
    //         }
    //     }
    //     return cnt;
    }
}