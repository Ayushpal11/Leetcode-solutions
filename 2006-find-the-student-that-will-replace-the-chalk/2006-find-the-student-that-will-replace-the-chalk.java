class Solution {
    public int chalkReplacer(int[] chalk, long k) {
        long sum = 0;
        for (int i = 0; i<chalk.length; i++){
            sum += chalk[i];
        }
        k =  k % sum;
        System.out.println(k);
        
        int temp = 0;
        for (int i=0; i<chalk.length; i++){
            if (chalk[i]<= k){
                k = k - chalk[i];
            }
            else {
                return i;
            }
        }
    return temp;
    }
}