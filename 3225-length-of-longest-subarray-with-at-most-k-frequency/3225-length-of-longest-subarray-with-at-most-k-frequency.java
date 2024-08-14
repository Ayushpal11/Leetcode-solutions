class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0;
        int freq = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if (mpp.get(nums[i]) == k+1){
                freq++;
            }if (freq > 0){
                mpp.put(nums[start], mpp.get(nums[start]) - 1);
                if (mpp.get(nums[start]) == k){
                    freq--;
                }
                start++;
            }
        }
        return nums.length-start;
    }
}