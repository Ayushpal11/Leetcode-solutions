class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        int[] arr = new int[101];
        for(int num : nums) arr[num]++;
        for (int i = 0 ; i < 101-k ; i++){
            cnt += arr[i] * arr[i+k];
        }
        return cnt;
    }
}