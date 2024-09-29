class Solution {
    private Map<Integer, List<Integer>> graph;
    private int[] cnt;
    private int[] res;

    private void dfs(int node, int parent) {
        for (int child : graph.get(node)) {
            if (child != parent) {
                dfs(child, node);
                cnt[node] += cnt[child];
                res[node] += res[child] + cnt[child];
            }
        }
    }

    private void dfs1(int node, int parent) {
        for (int child : graph.get(node)) {
            if (child != parent) {
                res[child] = res[node] - cnt[child] + (cnt.length - cnt[child]);
                dfs1(child, node);
            }
        }
    }

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        graph = new HashMap<>();
        cnt = new int[n];
        res = new int[n];
        Arrays.fill(cnt, 1);
        for (int i=0;i<n; i++){
            graph.put(i, new ArrayList<>());
        }

        for (int [] edge: edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        dfs(0,-1);
        dfs1(0,-1);

        return res;
    }
}