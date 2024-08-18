class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> uglyset = new TreeSet<>();
        uglyset.add(1L);

        Long currugly = 1L;
        for (int i = 0; i < n; i++){
            currugly = uglyset.pollFirst();
            uglyset.add(currugly * 2);
            uglyset.add(currugly * 3);
            uglyset.add(currugly * 5);
        }
        return currugly.intValue(); 
    }
}