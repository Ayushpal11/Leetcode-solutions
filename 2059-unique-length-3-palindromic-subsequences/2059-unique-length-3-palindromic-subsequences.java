class Solution {
    public int countPalindromicSubsequence(String s) {
        int [] fir = new int[26];
        int [] sec = new int[26];
        Arrays.fill(fir, -1); 
        for (int i=0; i<s.length(); i++){
            int curr = s.charAt(i) - 'a';
            if (fir[curr] == -1){
                fir[curr] = i;
            }
            sec [curr] = i;
        }
        int res = 0;
        for (int i=0; i<26; i++){
            if (fir[i] == -1){
                continue;
            }
            Set<Character> mid = new HashSet<>();
            for (int j=fir[i]+1; j<sec[i]; j++){
                mid.add(s.charAt(j));
            }
            res += mid.size();
        }
        return res;
    }
}