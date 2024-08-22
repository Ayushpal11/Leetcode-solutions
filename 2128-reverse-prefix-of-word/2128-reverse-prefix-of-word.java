class Solution {
    public String reversePrefix(String word, char ch) {
        int start = 0;
        int end = word.indexOf(ch);
        StringBuilder res = new StringBuilder(word);
        while(start < end){
            char temp = res.charAt(end);
            res.setCharAt(end, res.charAt(start));
            res.setCharAt(start,temp);
            start++;
            end--;
        }

        return res.toString();
    }
}