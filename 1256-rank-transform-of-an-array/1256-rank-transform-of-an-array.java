class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int a: arr){
            set.add(a);
        }
        List<Integer> lis = new ArrayList<>(set);
        Collections.sort(lis);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i=0; i<lis.size(); i++){
            mpp.put(lis.get(i), i+1);
        }
        for (int i=0; i<arr.length; i++){
            arr[i] = mpp.get(arr[i]);
        }
        return arr;
    }
}