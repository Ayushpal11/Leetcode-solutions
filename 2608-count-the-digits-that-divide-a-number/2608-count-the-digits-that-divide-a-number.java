class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        int ss = num;
        while (ss > 0){
            int last = ss % 10;
            if (num % last == 0){
                cnt++;
            }
            ss /= 10; 
        }
        return cnt;
    }
}