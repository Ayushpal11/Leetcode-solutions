class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        int preSum = 0 ;
        int cnt = 0;
        mpp.put(0,1);
        for(int i=0; i<nums.length;i++){
            preSum += nums[i];
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove,0);
            mpp.put(preSum,mpp.getOrDefault(preSum,0)+1);
        }


        // for (int i = 0; i < nums.length; i++) {

        //     int sum = 0;

        //     for (int j = i; j < nums.length; j++) {

        //         sum += nums[j];

        //         if (sum == k) {
        //             cnt++;
        //         }
        //     }
        // }
        return cnt;
    }
}