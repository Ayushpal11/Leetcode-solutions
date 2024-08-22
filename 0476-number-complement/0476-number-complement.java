class Solution {
    public int findComplement(int num) {
        if (num <= 1) return 0;
        for (long i = 1; i <= num; i<<= 1){
            num ^= i;
        }
        return num;    
    }
}