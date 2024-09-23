class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>(Arrays.asList(bannedWords));
        int cnt = 0;
        for (String  mes: message){
            if (set.contains(mes)){
                cnt++;
            }
            if(cnt == 2){
                return true;
            }
        }
        return false;
    }
}