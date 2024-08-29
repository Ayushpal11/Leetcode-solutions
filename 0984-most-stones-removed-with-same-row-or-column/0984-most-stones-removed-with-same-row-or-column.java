class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        int m = stones[0].length;

        List<Integer>[] adj = new List[n];
        for (int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
        for (int i= 0; i<n;i++){
            for (int j=i+1;j<n; j++){
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }
        int connections = 0;
        boolean[] visited = new boolean[n];
        for (int i= 0; i< n; i++){
            if (!visited[i]){
                dfs(adj, visited, i);
                connections++;
            }
        }

        return n - connections; 
    }
    private void dfs(List<Integer>[] adj, boolean[] visited, int stone){
        visited[stone] = true;
        for (int neigh : adj[stone]){
            if (!visited[neigh]){
                dfs(adj , visited, neigh);
            }
        }
    }
}