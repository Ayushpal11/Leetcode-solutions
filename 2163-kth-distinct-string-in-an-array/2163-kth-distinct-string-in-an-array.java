class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String , Integer> mpp = new HashMap<>();

        for (String str: arr){
            mpp.put(str,mpp.getOrDefault(str,0) + 1);
        }

        for (String str: arr){
            if (mpp.get(str) == 1){
                k--;
            }
            if (k == 0){
                return str;
            }
        }
        return "";
    }
}