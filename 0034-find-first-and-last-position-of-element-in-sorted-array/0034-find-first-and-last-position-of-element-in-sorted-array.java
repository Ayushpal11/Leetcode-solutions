class Solution {
    public int[] searchRange(int[] nums, int target) {
        int position = Arrays.binarySearch(nums,target);
        if (position < 0) return new int[] {-1, -1};
        int min = position - 1;
        int max = position + 1;
        while(min >= 0 && nums[min] == target) min--;
        while(max < nums.length && nums[max] == target) max++;
        return new int[]{min+1, max-1};
    }
}