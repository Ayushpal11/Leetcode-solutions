class Solution {
    private long countSteps(long curr, long n) {
        long steps = 0, first = curr, last = curr;
        while (first <= n) {
            steps += Math.min(n + 1, last + 1) - first;
            first *= 10;
            last = last * 10 + 9;
        }
        return steps;
    }
    public int findKthNumber(int n, int k) {
        // long num = 1;
        // for (int i = 0; i<=n ; i++){
        //     if (i+1 == k) return (int) num;
        //     if (num * 10 <= n){
        //         num *= 10;
        //     }else{
        //         while(num % 10 == 9 || num >= n){
        //             num /= 10;
        //         }
        //         num += 1;
        //     }
        // }
        // return 0;
                long curr = 1;  // Start from the prefix 1
        k--;  // We start counting from 1, so decrement k
        
        while (k > 0) {
            long steps = countSteps(curr, n);
            if (steps <= k) {
                curr++;  // Move to the next prefix
                k -= steps;
            } else {
                curr *= 10;  // Dive deeper into the current prefix
                k--;
            }
        }
        
        return (int) curr;
    }
}