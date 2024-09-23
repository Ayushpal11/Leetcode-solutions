class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long score = 0;
        // for (int i=0 ;i<nums.size()-1; i++){
        //     for (int j=i+1; j<nums.size()-1; j++){
        //         if (nums.get(j) > nums.get(i)){
        //             score = (j-i) * nums.get(i);
        //         }else {
        //             score = nums.get(i) *  nums.get(i);
        //         }
        //     }
        // }
        // return score;

        long max = 0;
        for (long left = 0; left<nums.size(); left++){
            score += (long)max;
            max = Math.max(max, nums.get((int)left));
        }
        return score;
    }
}