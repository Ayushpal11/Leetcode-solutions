class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int cnt = 0;
        for (int i=0; i<s.length(); i++){
            for (int j = i, z= 0, o= 0; j<s.length(); j++){
                if(s.charAt(j) == '0')z++;
                if(s.charAt(j) == '1')o++;
                if (z <= k || o <= k) cnt++;
            }
        }
        return cnt;
    }
}