class Solution {
    public int minOperations(String[] logs) {
        int move = 0;
        for(String log : logs){
            if(log.equals("../")){
                if(move>0) {
                    move--;
                }
            }else if (!log.equals("./")){
                    move++;
            }
        }
        return move;
    }
}