class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int cnt = 0;
        char [] allow = allowed.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch: allow){
            set.add(ch);
        }
        for (String w: words){
            boolean isConsistent = true;
            for (char ch: w.toCharArray()){
                if (!set.contains(ch)){
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent){
                cnt++;
            }
        }
        return cnt;
    }
}