class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");

        for (int i = 0; i < n && k > sb.length(); i++) {
            sb.append('1');
            for (int j = sb.length() - 2; j >= 0; j--) {
                char invert = (sb.charAt(j) == '1') ? '0' : '1';
                sb.append(invert);
            }
        }

        return sb.charAt(k - 1);
    }
}