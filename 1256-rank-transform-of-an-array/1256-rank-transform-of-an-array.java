class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i= 0; i<list.size(); i++){
            mpp.put(list.get(i), i+1);
        } 
        for (int i=0; i < arr.length;i++){
            arr[i] = mpp.get(arr[i]);
        }
        return arr;
    }
}