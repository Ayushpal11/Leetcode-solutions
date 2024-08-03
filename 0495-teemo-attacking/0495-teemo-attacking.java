class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int cnt = 0;
        if (timeSeries.length == 0) return 0;
        for (int i = 0; i<timeSeries.length - 1; i++){
            cnt += Math.min(timeSeries[i + 1] - timeSeries[i] , duration);       
        }
        return cnt + duration;
    }
}