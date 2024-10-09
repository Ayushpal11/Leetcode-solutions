class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> st = new Stack<>();
        int cnt = 0;
        int req = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                cnt++;
            }else {
                if (cnt > 0){
                    cnt--;
                }else {
                    req++;
                }
            }
        }
        return Math.abs(req+cnt);
    }
}