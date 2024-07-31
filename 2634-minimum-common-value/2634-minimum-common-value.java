class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Set<Integer> set1 = new HashSet<>();

        // for (int num :nums1){
        //     set1.add(num);
        // }   

        // for (int num :nums2){
        //     if (set1.contains(num)){
        //         return num;
        //     }
        // }
        
        int first = 0;
        int second = 0;

        while (first < nums1.length && second < nums2.length){
            if (nums1[first] < nums2[second]){
                first++;
            }else if (nums1[first] > nums2[second]){
                second++;
            }else {
                return nums1[first];
            }
        }

        return -1;
    }
}