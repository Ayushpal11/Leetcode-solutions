class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 0, r = 1000_000_000_000_00L,cnt = 0;
        while(l <= r){
            long mid = (l+r)/2;
            if (can(time,totalTrips,mid)){
                cnt = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return cnt;
    }
    boolean can (int[] time, int totalTrips, long mid){
        int n = time.length;
        long cnt = 0;
        for (int i=0;i<n; i++){
           cnt += mid/time[i];
        }
        return cnt>=totalTrips;
    }
}