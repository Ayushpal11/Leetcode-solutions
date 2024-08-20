class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int cnt = 0;
        int target = 0;
        for (int i = 1; i< nums.length; i++){
            if (nums[i-1] == key){
                mpp.put(nums[i],mpp.getOrDefault(nums[i],0) + 1);
                if (mpp.get(nums[i]) > cnt){
                    cnt = mpp.get(nums[i]);
                    target = nums[i];
                }
            }
        }
        return target;
    }
}