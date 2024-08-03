class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Integer>[] mpp = new HashMap[n];


        for (int i=0; i<n;i++){
            mpp[i] = new HashMap();
        }

        for (int[] p: pick){
            int player = p[0];
            int color = p[1];

            mpp[player].put(color,mpp[player].getOrDefault(color, 0) + 1 );
        }

        int win = 0;
        for (int i = 0; i <n ;i++){
            for (int cnt :mpp[i].values()){
                if (cnt > i){
                    win++;
                    break;
                }
            }
        }
        return win;

    }
}