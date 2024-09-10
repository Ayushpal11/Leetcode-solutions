class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i=1; i<s.length(); i++){
            if (s.charAt(i) == '('){
                cnt++;
                sb.append('(');
            }else {
                if (cnt == 0){
                    i++;
                }else {
                    sb.append(')');
                    cnt--;
                }
            }
        }
        return sb.toString();
    }
}