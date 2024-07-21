//Optimal
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }   
}

//O(N)
//O(1)

// Brute
// for (int i = 1 ; i<nums.length; i++){
// int num = nums[i];
// int cnt = 0;
// for (int j = 0 ; j<nums.length; j++){
// if (nums[j] == num){
// cnt++;
// }
// }
// if (cnt == 1) return num;
// }
// return 1;
// }
//O(N^2)
//O(1)
