class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for(int i = 0 ; i<n ;i++){
            while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                int element = st.pop();
                int nse = i;
                int pse = st.isEmpty()?-1:st.peek();
                maxArea = Math.max(maxArea , heights[element] * (nse-pse-1));
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            int el = st.pop();

            int pse = st.isEmpty()?-1:st.peek();
            maxArea = Math.max(maxArea, heights[el] * (n-pse-1));
        }
        return maxArea;
    }
}