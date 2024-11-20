class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0;
        long cur_sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k-1;i++){
            cur_sum+=nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int i=k-1;
        while(i<nums.length){
            cur_sum+=nums[i];
            if(!map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
                if(map.size()==k){
                    ans = Math.max(ans, cur_sum);
                }
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
            map.put(nums[i-k+1], map.get(nums[i-k+1])-1);
            cur_sum-=nums[i-k+1];
            if(map.get(nums[i-k+1])==0){
                map.remove(nums[i-k+1]);
            }
            i++;
        }
        return ans;
    }
}