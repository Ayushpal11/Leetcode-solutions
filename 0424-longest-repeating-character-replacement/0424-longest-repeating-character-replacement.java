class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt = new int[26];
        int left = 0, right = 0, maxCnt = 0, sum = 0;

        while (right < s.length()){
            cnt[s.charAt(right) - 'A']++;
            sum = Math.max(sum,cnt[s.charAt(right) - 'A']);

            int numChange = (right - left + 1) - sum;

            if (numChange > k){
                cnt[s.charAt(left) - 'A']--;
                left++;
            }
            maxCnt = Math.max(maxCnt, right - left + 1);
            right++;
        }
        return maxCnt;
    }
}