class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int e = 0;
        for (int[] interval : intervals) {
            if (interval[0] <= intervals[e][1]) { 
                intervals[e][1] = Math.max(intervals[e][1], interval[1]);
            } else { 
                intervals[++e][0] = interval[0];
                intervals[e][1] = interval[1];
            }
        }
        if (e == intervals.length - 1) return intervals;
        return Arrays.copyOfRange(intervals, 0, e + 1);
    }
}