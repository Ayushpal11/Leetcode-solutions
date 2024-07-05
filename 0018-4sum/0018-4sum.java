// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> list = new ArrayList<>();
//         Set<List<Integer>> set = new HashSet<>();
//         for (int i = 0 ; i<nums.length; i++){
//             for (int j = 1+1 ; j<nums.length ; j++){
//                 for (int k = j+1; k< nums.length; k++){
//                     for (int l = k+1 ; l<nums.length; l++){
//                         if(nums[i]+nums[j]+nums[k]+nums[l] == target){
//                             set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
//                         }
//                     }
//                 }
//             }
//         }
//         for(List<Integer> temp: set){
//             list.add(temp);
//         }
//         return list;
//     }
// }
// O(N^4)
//O(2 * no. of the quadruplets) 

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; 
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;
    }
}
//O(N^3)
//O(1)