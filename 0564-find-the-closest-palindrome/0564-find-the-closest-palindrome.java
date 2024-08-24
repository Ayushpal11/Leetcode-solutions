class Solution {
    private long cont(long num){
        String s = Long.toString(num);
        int n = s.length();
        int left = (n-1)/ 2, right = n / 2;
        char[] stringArray = s.toCharArray();
        while(left >= 0){
            stringArray[right++] = stringArray[left--];
        }
        return Long.parseLong(new String(stringArray));
    }
     private long previousPalindrome(long num) {
        long left = 0, right = num;
        long sol = Long.MIN_VALUE;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            long palin = cont(mid);
            if (palin < num) {
                sol = palin;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return sol;
    }

    // Find the next palindrome, just greater than n.
    private long nextPalindrome(long num) {
        long left = num, right = (long) 1e18;
        long sol = Long.MIN_VALUE;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            long palin = cont(mid);
            if (palin > num) {
                sol = palin;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return sol;
    }

    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        long a = previousPalindrome(num);
        long b = nextPalindrome(num);
        if (Math.abs(a - num) <= Math.abs(b - num)) {
            return Long.toString(a);
        }
        return Long.toString(b);
    }
}