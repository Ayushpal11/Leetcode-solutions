class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1, width = 0;
        for (char ch:s.toCharArray()){
            int w = widths[ch - 'a'];
            width += w;
            if (width > 100){
                lines++;
                width = w;
            }
        }
        return new int[]{lines,width};
    }
}