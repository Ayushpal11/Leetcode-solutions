class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (s.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}