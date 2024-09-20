class Solution {
    public String shortestPalindrome(String s) {
        int len = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        for(int i=0; i<len; i++){
            if (s.substring(0, len-i).equals(rev.substring(i))){
                return new StringBuilder(rev.substring(0,i)).append(s).toString();
            }
        }
        return  "";
    }
}