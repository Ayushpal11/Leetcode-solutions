class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        int [] res = new int[26];
        for (int i=0 ;i<s1.length(); i++){
            res[s1.charAt(i) - 'a']++;
        }
        for (int i=0; i<= s2.length() - s1.length(); i++){
            int [] res2 = new int[26];
            for (int j=0; j< s1.length(); j++){
                res2[s2.charAt(i + j) - 'a']++;
            }
            if (same(res, res2)){
                return true;
            }
        }
        return false;
    }
    public boolean same(int [] res, int [] res2){
        for (int i=0; i<26; i++){
            if (res[i] != res2[i]) return false;
        }
        return true;
    }
}