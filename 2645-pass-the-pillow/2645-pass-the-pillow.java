class Solution {
    public int passThePillow(int n, int time) {
        int complete = time / (n-1);
        int remain = time % (n-1);
        int res = 0;
        if (complete % 2 != 0){
            res = n - remain;
        }else{
            res = remain + 1;
        }
        return res;
    }
}