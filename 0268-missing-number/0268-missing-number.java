

class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
      int sum = (N * (N + 1)) / 2;
      int s2 = 0;
      for (int i = 0 ; i< N ; i++){
        s2 += nums[i];
      }
      int missingNum = sum -s2;
      return missingNum;
    }
}
//O(N)
//O(1)



//Brute
        // for (int i=1 ; i<nums.length; i++){
        //     int flag = 0;
        //     for (int j = 0; j<nums.length - 1; j++){
        //         if(nums[j] == i){
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         return i;
        //     }
        // }
        // return -1;

// Array

    //      int [] hash = new int[nums.length+1];
    //     for(int i = 0; i<nums.length ; i++){
    //         hash[nums[i]]++;
    //     }
    //     for (int i = 1; i<nums.length ; i++){
    //         if (hash[i] == 0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }