class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if (s.length() == 0) return 0;
        // int maxans = Integer.MIN_VALUE;
        // for (int i = 0;i<s.length(); i++){
        //     Set<Character> set = new HashSet<>();
        //     for(int j=i; j < s.length(); j++){
        //         if (set.contains(s.charAt(j))){
        //             maxans = Math.max(maxans, j - i);
        //             break;
        //         }
        //         set.add(s.charAt(i));
        //     }
        // }
        // return maxans;
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            mpp.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }// SC O(N)
    // TC O(N)
}