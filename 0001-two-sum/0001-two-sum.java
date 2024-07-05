class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                   return new int [] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
// O(N^2)
// O(1)


// class Solution {
//     public int[] twoSum(int[]nums, int target){
//         int n = nums.length;
//         int left = 0;
//         int right = n-1;
//         sort(nums.begin(),nums.end());
//         while(left<right){
//             int sum = nums[left]+nums[right];
//             if (sum == target){
//                 return new int [] {left,right};
//             }else if (sum < target){
//                 left++;
//             }
//             else {
//                 right -- ;
//             }
//         }
//         return new int [] {};
//     }
// }

// O(N) + O(N*logN)
// O(N)