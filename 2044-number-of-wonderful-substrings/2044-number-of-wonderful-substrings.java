class Solution {
    public long wonderfulSubstrings(String word) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int mask = 0;
        long cnt = 0;
        mpp.put(0,1);
        for (char ch:word.toCharArray()){
            mask ^= (1 << (ch - 'a' ));
            cnt += mpp.getOrDefault(mask,0);
            for (int i=0; i<10; i++){
                cnt += mpp.getOrDefault(mask ^ (1 << i), 0);
            }
            mpp.put(mask, mpp.getOrDefault(mask, 0) + 1);
        }
        return cnt;
    }
}