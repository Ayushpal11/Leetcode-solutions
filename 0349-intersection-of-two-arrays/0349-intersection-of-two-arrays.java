class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (Integer num : nums1){
            set.add(num);
        }
        for(Integer num : nums2){
            set1.add(num);
        }

        set.retainAll(set1);
        int[] opt = new int[set.size()];
        int indx = 0;
        for (int s :set){
            opt[indx++] = s;
        }
        return opt;
    }
}