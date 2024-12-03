class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            int currsum = numbers[left] + numbers[right];
            if (currsum == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }else if (currsum < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{};
    }
}