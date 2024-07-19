// class Solution {
//     public void moveZeroes(int[] nums) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] != 0) temp.add(nums[i]);
//         }

//         int nz = temp.size();
        
//         for (int i = 0 ; i<nz; i++){
//             nums[i] = temp.get(i);
//         }for (int i = nz; i< nums.length; i++){
//             nums[i]=0;
//         }
//         return;
//     }
// }
// O(2*N)
// O(N)

class Solution{
    public void moveZeroes(int [] nums){
        int j = -1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if (j == -1) return;
        
        for (int i = j+1; i<nums.length; i++){
            if(nums[i]!= 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return;
    }
}

//TC O(N)
//SC O(1)