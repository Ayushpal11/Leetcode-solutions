class Solution {
    public String fractionAddition(String expression) {
        int num = 0;
        int denom = 1;

        String[] nums = expression.split("/|(?=[-+])");
        for (int i=0; i< nums.length; i+=2){

            int currnum = Integer.valueOf(nums[i]);
            int currdenom = Integer.valueOf(nums[i+1]);
            num = num * currdenom + currnum * denom;
            denom = denom * currdenom;
        }
        int gcd = Math.abs(FindGCD(num,denom));

        num /= gcd;
        denom /= gcd;
        return num + "/" + denom;
    }
    private int FindGCD(int a,int b){
        if (a == 0) return b;
        return FindGCD(b % a, a);
    }
}