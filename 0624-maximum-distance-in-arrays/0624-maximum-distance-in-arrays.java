class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int min = arrays.get(0).get(0);
        int diff = Integer.MIN_VALUE;
        for (int i =1; i< arrays.size(); i++){
            List<Integer> lis = arrays.get(i);
            int fir = lis.get(0);
            int sec = lis.get(lis.size()-1);

            // Max difference for both
            diff = Math.max(diff,Math.abs(max-fir));
            diff = Math.max(diff,Math.abs(sec-min));

            //calculate max and min
            max = Math.max(sec,max);
            min = Math.min(min,fir);
        }
        return diff;
    }
}