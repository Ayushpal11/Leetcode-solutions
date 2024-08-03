class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);

        for (int i = 0; i< target.length; i++){
            if (arr[i] != target[i]){
                return false;
            }
        }
        // int sum = 0;
        // int res = 0;
        // for (int i = 0 ; i<target.length; i++){
        //     sum += target[i];
        // }
        // for (int i = 0; i<arr.length; i++){
        //     res += arr[i];
        // }
        // if (sum == res){
        //     return true;
        // }
        // return false;

        return true;
    }
}