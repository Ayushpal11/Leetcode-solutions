class Solution {
    public int findPairs(int[] nums, int k) {
        int first = 0;
        int sec =  1, cnt = 0;
        Arrays.sort(nums);

        while (sec < nums.length){
            int diff = nums[sec] - nums[first];
            if (diff == k){
                cnt++;
                first++;
                sec++;
            }else if (diff <k){
                sec++;
            }else {
                first++;
            }while (sec < nums.length && nums[sec] == nums[sec - 1]){
                sec ++;
            }if (first == sec) sec++;
        }
        return cnt;
    }
}