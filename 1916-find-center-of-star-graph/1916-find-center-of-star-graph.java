class Solution {
    public int findCenter(int[][] edges) {
        // int[] first = edges[0];
        // int[] second = edges[1];

        // return(first[0] == second[1] || first[0] == second[1]) 
        // ? first[0] : first[1];

        Map<Integer, Integer> mpp = new HashMap<>();
        for (int[] edge: edges){
            mpp.put(edge[0],mpp.getOrDefault(edge[0],0)+1);
            mpp.put(edge[1],mpp.getOrDefault(edge[1],0)+1);
        }
        for (int ed : mpp.keySet()){
            if (mpp.get(ed) == edges.length){
                return ed;
            }
        }
        return -1;
    }
}