class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;

        for (int i=0; i<words.length; i++){
            for (int j=0; j<words.length; j++){
                if ( i<j && i !=j && isPrefixAndSuffix(words[i],words[j])){
                    cnt++;
                }
                //System.out.print(words[i] + words[j]);
            }
        }
        return cnt;
    }
    private boolean isPrefixAndSuffix(String str1, String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}