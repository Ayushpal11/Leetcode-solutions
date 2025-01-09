class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt =0;
        //HashMap<String, Integer> mpp = new HashMap<>();
        for (String str: words){
            if(str.startsWith(pref)){
                cnt++;
            }
        }   
        return cnt;
    }
}