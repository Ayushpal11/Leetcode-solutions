class Solution {
    public boolean lemonadeChange(int[] bills) {
        int num = 0;
        int fiv= 0;
        for(int bill: bills){
            if (bill == 5){
                fiv++;
            }else if (bill == 10){
                if (fiv == 0) return false;
                fiv--;
                num++;
            }else{
                if(fiv > 0 && num >0){
                    fiv--;
                    num--;
                }else if(fiv >= 3){
                    fiv -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}