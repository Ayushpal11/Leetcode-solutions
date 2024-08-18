class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        List<Integer> lis = new ArrayList<>();
        // for (int i = 0; i < n; i++){
        //     cnt[nums[i]]++;
        // }
        for (int num:nums){
            cnt[num]++;
        }
        for (int i = 1; i <cnt.length; i++){
            if(cnt[i] == 2){
                lis.add(i);
            }
        }
        return lis;
    }
}