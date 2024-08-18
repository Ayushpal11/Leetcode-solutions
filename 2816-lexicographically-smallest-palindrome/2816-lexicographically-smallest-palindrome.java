class Solution {
    public String makeSmallestPalindrome(String s) {
        char str[] = s.toCharArray();
        int one = 0;
        int two = s.length()-1;
        while(one<two){
            str[one] = (char)Math.min(str[one],str[two]);
            str[two] = str[one];
            one++;
            two--;
        }
        return new String(str);
    }
}