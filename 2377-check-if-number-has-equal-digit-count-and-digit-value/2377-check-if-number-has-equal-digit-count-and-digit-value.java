class Solution {
    public boolean digitCount(String num) {
        int[] hash = new int[10];
        for (int i =0 ;i<num.length();i++){
            hash[num.charAt(i) - '0']++;
        }for (int i= 0 ; i< num.length(); i++){
            if(hash[i] == num.charAt(i) -'0'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}