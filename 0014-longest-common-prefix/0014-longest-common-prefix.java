class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int cnt = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while (cnt < first.length() && cnt <last.length()){
            if (first.charAt(cnt) == last.charAt(cnt)){
                cnt++;
            }else{
                break;
            }
        }
        return first.substring(0,cnt);
    }
}