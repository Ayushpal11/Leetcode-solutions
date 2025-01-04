class Solution {
    // For (nums < k) add up total sum;
    // Set a window size of K and calculate sum of them 
    // Compare the max sum from prev and curr return the max
    public int splitArray(int[] nums, int k) {
        int totSum = 0;
        int max = 0;
        for (int num: nums){
            max = Math.max(max, num);
            totSum += num;
        }
        while (max <= totSum){
            int mid = max + (totSum - max)/ 2;
            int cnt = helper(nums, mid);
            if (cnt <= k) totSum = mid - 1;
            else max = mid + 1;
        }
        return max;
        // Arrays.sort(nums);
        // for (int i= nums.length-1; i >= nums.length - k; i--){
        //     totSum += nums[i];
        // }
        // List<Integer> lis = new ArrayList<>();
        // int currSum = 0;
        // for (int i=0; i<nums.length-k; i++){
        //     currSum += nums[i];
        //     lis.add(currSum);
        // }
        // System.out.println(lis);
    }

    private static int helper(int[] nums, int hiSum){
        int cnt = 1, sum = 0;
        for (int num: nums){
            if (num + sum <= hiSum){
                sum += num;
            }else {
                cnt ++;
                sum = num;
            }
        }
        return cnt;
    }
}