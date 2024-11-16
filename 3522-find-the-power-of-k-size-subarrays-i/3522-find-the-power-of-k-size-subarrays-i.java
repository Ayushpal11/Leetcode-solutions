class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];

        for (int i= 0; i<=nums.length-k; i++){
            boolean isConsecutive = true;
            int maxEl = nums[i];
            for (int j = i + 1 ; j<i+k ; j++){
                if (nums[j] != nums[j-1] + 1){
                    isConsecutive = false;
                }
                maxEl = Math.max(maxEl, nums[j]);
            }
            if (isConsecutive){
                res[i] = maxEl;
            }else{
                res[i] = -1;
            }
        }
        return res;
    }
}