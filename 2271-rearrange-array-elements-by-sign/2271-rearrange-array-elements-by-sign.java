class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pve=new ArrayList<>();
        ArrayList<Integer> nge=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pve.add(nums[i]);
            } 
            else {
                nge.add(nums[i]);
            }
        }for(int i=0;i<nums.length/2;i++){
            nums[2*i] = pve.get(i);
            nums[2*i+1] = nge.get(i);
        }
        return nums;
    }
}