class Solution {
    public String reverseWords(String s) {
    //     int left = 0;
    //     int right = s.length() - 1;

    //     String a = "";
    //     String b = "";

    //     while(left <= right){
    //         char ch = s.charAt(left);
    //         if(ch != ' '){
    //             a += ch;
    //         }
    //         else if (ch == ' '){
    //             if (!b.equals("")){
    //                 b = a + " " + b;
    //             }else{
    //                 b = a;
    //             }
    //             a = " ";
    //         }
    //         left++;


    //     }
    //     if(!a.equals("")){
    //         if (!b.equals("")) {
    //             b = a + " " + b;
    //         } else {
    //             b = a;
    //         }
    //     }
    //     return b;
    // }
    String[] word=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--)
        {
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
