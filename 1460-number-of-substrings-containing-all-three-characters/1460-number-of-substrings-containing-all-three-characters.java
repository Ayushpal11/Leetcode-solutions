class Solution {
    public int numberOfSubstrings(String s) {
        int right = 0 , ans = 0;
        int a = -1;
        int b = -1;
        int c = -1;

        while(right < s.length()){
            if (s.charAt(right) == 'a'){
                a = right;
            }else if(s.charAt(right) == 'b'){
                b = right;
            }
            else{
                c = right;
            }

            if (a != -1 && b != -1 && c != -1){
                ans += Math.min(a, Math.min(b,c)) + 1;
            }
            right ++;
        }
        return ans;
    }
}