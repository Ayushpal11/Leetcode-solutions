class Solution {
    public int findTheWinner(int n, int k) {
        // ArrayList<Integer> lis = new ArrayList<>();
        // Queue<Integer> q = new LinkedList<>();
        // for (int i=1; i<=n; i++){
        //     q.offer(i);
        // }
        // int j = 0;
        // for (int i=0; i<n; i++){
        //     j = i + k;
        //     if (!q.isEmpty()){
        //         q.offer(3);
        //     }
        // }

        // return q.peek();
        int ans = 0;
        for (int i = 2; i<= n; i++){
            ans = (ans + k) % i;
        }
        return ans + 1;
    }
}