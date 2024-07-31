class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int freq = 0;
        int res = 0;
        for (int i = 0; i<nums.length; i++){
            int cnt = 1;
            while (i+1< nums.length && nums[i] == nums[i+1]){
                cnt++;
                i++;
            }if (freq < cnt){
                freq = cnt;
                res = cnt;
            }else if(freq == cnt) {
                res += cnt;
            }
        }
        return res;
    }
}

// O(nlogn)
//O(N)