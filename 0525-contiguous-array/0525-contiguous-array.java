class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,-1);
        int sum = 0;
        int cnt = 0;
        for (int  i = 0; i< nums.length; i++){
            sum += ((nums[i] == 0) ? -1 : 1);
            if (mpp.containsKey(sum)){
                int len = i - mpp.get(sum);
                cnt = Math.max(len,cnt);
            }else{
                mpp.put(sum,i);
            }

        }
        return cnt;
    }
}