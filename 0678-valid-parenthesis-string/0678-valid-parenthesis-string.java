class Solution {
    public boolean checkValidString(String s) {
        char[] s1=s.toCharArray();
        int min=0;
        int max=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='('){
                min++;
                max++;
            }
            else if(s1[i]==')'){
                min--;
                max--;
            }
            else{
                min--;
                max++;
            }
            if(max<0){
                return false;
            }
            if(min<0){
                min=0;
            }
            
        }
        return min==0;
        
    }
}