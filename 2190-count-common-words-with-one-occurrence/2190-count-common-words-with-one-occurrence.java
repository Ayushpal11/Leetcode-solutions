class Solution {
    public int countWords(String[] words1, String[] words2) {
        int cnt = 0;

        Map<String, Integer> mpp1 = new HashMap<String, Integer>();
        for (String s:words1){
            mpp1.put(s,mpp1.getOrDefault(s,0) + 1);
        } 
        Map<String, Integer> mpp2 = new HashMap<String, Integer>();
        for (String s:words2){
            mpp2.put(s,mpp2.getOrDefault(s,0) + 1);
        } 

        for (String s: words2){
            if (mpp1.containsKey(s) && (mpp1.get(s)==1) && mpp2.get(s) == 1){
                cnt++;
            }
        }
        return cnt;
    }
}