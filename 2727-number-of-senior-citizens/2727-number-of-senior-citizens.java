class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;

        for (String info: details){
            int age = Integer.parseInt(info.substring(11,13));

            if (age>60){
                cnt++;
            }
        }
        return cnt;
    }
}