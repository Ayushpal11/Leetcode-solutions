class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int low = 0;
        int high = nums[n-1];

        while (low<high){
            int mid = (low + high)/2;

            int cnt = countPairs(nums,mid);
            if (cnt < k){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return low;
    }
    public int countPairs(int[] nums, int maxDistance){
        int n = nums.length;
        int left = 0;
        int cnt = 0;
        for (int right = 0; right < nums.length; right++){
            while (nums[right] - nums[left] > maxDistance){
                ++left;
            }
            cnt += right - left;
        }
        return cnt;
    }
}