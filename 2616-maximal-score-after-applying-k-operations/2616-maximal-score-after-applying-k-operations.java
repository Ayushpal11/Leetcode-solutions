class Solution {
    public long maxKelements(int[] nums, int k) {
        long res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num: nums){
            pq.add(num);
        }

        while (k-- > 0){
            int temp = pq.poll();
            res += temp;
            pq.add((int) Math.ceil(temp/3.0));
        }

        return res;
    }
}