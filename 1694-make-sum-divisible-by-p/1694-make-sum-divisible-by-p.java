class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        int res = nums.length;
        for (int num: nums){
            sum = (sum + num) % p;
        }
        int mod = sum % p;
        if (mod == 0) return 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, -1);
        int curr = 0;
        for (int i=0; i<nums.length; i++){
            curr = (curr + nums[i]) % p;
            int req = (curr - mod + p) % p;
            if (mpp.containsKey(req)){
                res = Math.min(res, i-mpp.get(req));
            }
            mpp.put(curr, i);
        }
        return res == nums.length ? -1 : res;
    }
}