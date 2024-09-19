// class Solution {
//     public List<Integer> diffWaysToCompute(String expression) {
//         int n = expression.length();
//         List<Integer>[][] dp = new ArrayList[n][n];
//         initializeBaseCases(expression, dp);
//         //Length
//         for (int i=3; i <= n; i++){
//             //Start
//             for (int j=0; i+j-1 < n; j++){
//                 int end = i + j - 1;
//                 processSubExp(expression, dp, j, end);
//             }
//         }
//         return dp[0][n-1];
//     }
//     private void initializeBaseCases(String expression, List<Integer>[][] dp){
//         int n = expression.length();
//         for (int i=0; i<n; i++){
//             for (int j=0; j<n; j++){
//                 dp[i][j] = new ArrayList<>();
//             }
//         }
//         for (int i=0; i<n ; i++){
//             if(Character.isDigit(expression.charAt(i))){
//                 int dig = expression.charAt(i) - '0';
//                 if (i + 1 < n && Character.isDigit(expression.charAt(i+1))){
//                     int dig1 = expression.charAt(i+1) - '0';
//                     int number = dig * 10 * dig1;
//                     dp[i][i+1].add(number);
//                 }
//                 dp[i][i].add(dig);
//             }
//         }
//     }
//     private void processSubExp(String expression, List<Integer>[][] dp, int start, int end){
//         for (int split = start; split<=end; split++){
//             if(Character.isDigit(expression.charAt(split))) continue;
//             List<Integer> leftRes = dp[start][split-1];
//             List<Integer> rightRes = dp[split+1][end];
//             computeResults(expression.charAt(split), leftRes, rightRes, dp[start][end]); 
//         }
//     }
//     private void computeResults(char op, List<Integer> leftRes, List<Integer> rightRes,
//     List<Integer> results
//     ){
//         for(int leftValue: leftRes){
//             for (int rightValue: rightRes){
//                 switch(op){
//                     case '+':
//                     results.add(leftValue + rightValue);
//                     break;
//                     case '-':
//                     results.add(leftValue - rightValue);
//                     case '*':
//                     results.add(leftValue * rightValue);
//                     break;
//                 }
//             }
//         }
//     }
// }
public class Solution {
    List<Integer> nums = new ArrayList<>();
    List<Character> ops = new ArrayList<>();
    public List<Integer> diffWaysToCompute(String input) {
        //parse the input
        int cur = 0;
        for(int i = 0; i < input.length(); ++i){
            char c = input.charAt(i);
            if(c >= '0' && c <= '9')
                cur = cur * 10 + (c - '0');
            else{
                nums.add(cur);
                cur = 0;
                ops.add(c);
            }
        }
        nums.add(cur);
        List<Integer> list = rec(0, ops.size() - 1);
        /*
        List<Integer> list = new LinkedList<Integer>();
        for(int n : set)
            list.add(n);
            */
        return list;
    }
    
    private List<Integer> rec(int start, int end){
        List<Integer> ans = new LinkedList<Integer>();
        if(start > end){
            ans.add(nums.get(start));
            return ans;
        }else{
            for(int mid = start; mid <= end; ++mid){
                List<Integer> leftSet = rec(start, mid - 1);
                List<Integer> rightSet = rec(mid + 1, end);
                for(int left : leftSet){
                    for(int right : rightSet){
                        ans.add(cal(left, right, ops.get(mid)));
                    }
                }
            }
            return ans;
        }
    }
    private int cal(int a, int b, char op){
        if(op == '+')
            return a + b;
        if(op == '-')
            return a - b;
        return a * b;
    }
}