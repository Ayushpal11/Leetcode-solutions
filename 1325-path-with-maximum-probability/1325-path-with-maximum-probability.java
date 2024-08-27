class Solution {
    public double maxProbability(int n, int[][] edges, double[] succp, int start, int end) {
        double[] maxp = new double[n];
        maxp[start] = 1.0;

        for(int i = 0; i< n-1; i++){
            boolean hasUpdate = false;
            for (int j= 0; j < edges.length; j++){
                int u = edges[j][0];
                int v = edges[j][1];
                double pathp = succp[j];
                if (maxp[u] * pathp > maxp[v]){
                    maxp[v] = maxp[u] * pathp;
                    hasUpdate = true;
                }
                if (maxp[v] * pathp > maxp[u]){
                    maxp[u] = maxp[v] * pathp;
                    hasUpdate = true;
                }
            }
            if (!hasUpdate){
                break;
            }
        }
        return maxp[end];
    }
}