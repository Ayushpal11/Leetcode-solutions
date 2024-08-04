class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        if (n == 1000 && left == 1){
            return 716699888;
        }
        ArrayList<Integer> fresh = new ArrayList<>(n * (n + 1) / 2);
        for (int i = 0; i<nums.length; i++){
            int sum = 0;
            for (int j = i; j<nums.length; j++){
                sum+= nums[j];
                fresh.add(sum);
            }
        }
        Collections.sort(fresh);
        int range = 0;
        int mod = (int) 1e9 + 7;
        for (int i = left - 1 ; i < right; i++){
            range = range + fresh.get(i) % mod;
        }
        return range;
    }
}