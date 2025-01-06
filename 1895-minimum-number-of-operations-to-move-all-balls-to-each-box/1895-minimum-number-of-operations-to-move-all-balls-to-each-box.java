class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = boxes.charAt(i) - '0';
        }
        int [] sol = new int[n];
        int ones = 0, sum= 0;
        for (int i=0; i<n; i++){
            sol[i] += sum;
            ones += arr[i];
            sum += ones; 
        }// left --> right done

        ones = 0;
        sum = 0;
        for (int i= n-1; i>= 0; i--){
            sol[i] += sum;
            ones += arr[i];
            sum += ones;
        }// right --> left done
        return sol;
    }
}