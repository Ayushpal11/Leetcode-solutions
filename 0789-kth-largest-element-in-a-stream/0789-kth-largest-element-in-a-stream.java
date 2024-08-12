class KthLargest {

    List<Integer> arr;
    int k;

    public KthLargest(int k, int[] nums) {
        arr = new ArrayList<Integer>(nums.length);
        this.k = k;

        for (int num: nums){
            arr.add(num);
        }

        Collections.sort(arr);
    }

    private int getIndex(int val){
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            int midEl = arr.get(mid);
            if (midEl == val) return mid;
            if (midEl > val){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    
    public int add(int val) {
        int index = getIndex(val);
        arr.add(index,val);
        return arr.get(arr.size() - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */