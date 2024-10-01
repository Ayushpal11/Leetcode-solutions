class Solution {
    public boolean canArrange(int[] arr, int k) {
        // for (int i = 0; i <arr.length; i++){
        //     for (int j = i+1; j< arr.length; j++){
        //         if(arr[i]+arr[j] == k){
        //            return true;
        //         }
        //     }
        // }
        // return false;
        Map<Integer, Integer> rem = new HashMap<>();
        for (int i : arr){
            int cnt = ((i % k) + k) % k;
            rem.put(cnt, rem.getOrDefault(cnt,0) + 1);
        }

        for (int i: arr) {
            int cnt = ((i % k) + k) % k;
            if (cnt == 0){
                if (rem.get(cnt) % 2 == 1) return false;
            }
            else if (
                !Objects.equals(
                    rem.get(cnt),
                    rem.get(k - cnt)
                )
            ) return false;
        }
        return true;
    }
}