// class Solution {
//     public List<String> stringMatching(String[] words) {
//         List<String> match = new ArrayList<>();
//         for (int i=0; i<words.length; i++){
//             for (int j=0; j < words.length; j++){
//                 if (i == j) continue;
//                 if (isSubstring(words[i], words[j])){
//                     match.add(words[i]);
//                     break;
//                 }
//             }
//         }
//         return match;
//     }
//     private boolean isSubstring(String first, String full){
//         for (int i=0; i<full.length(); i++){
//             boolean isSub = true;
//             for (int j=0; j<first.length(); j++){
//                 if (i+j >= full.length() || full.charAt(i+j) != first.charAt(j)){
//                     isSub = false;
//                     break;
//                 }
//             }
//             if (isSub){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public List<String> stringMatching(String[] words) {
        String str = String.join(" ", words);
        List<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                res.add(words[i]);
            }
        }
        return res;
    }
}