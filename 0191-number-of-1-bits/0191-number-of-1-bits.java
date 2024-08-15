class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        char [] arr = s.toCharArray();
        for (char rr:arr){
            if(rr == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}