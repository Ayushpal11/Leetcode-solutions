class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> mpp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        for (int arr: arr2){
            mpp.put(arr,0);
        }

        for (int arr: arr1){
            if (mpp.containsKey(arr)){
                mpp.put(arr,mpp.get(arr)+1);
            }else{
                left.add(arr);
            }
        }
        Collections.sort(left);

        for(int arr: arr2){
            for(int j = 0 ; j<mpp.get(arr); j++){
                res.add(arr);
            }
        }
        res.addAll(left);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}