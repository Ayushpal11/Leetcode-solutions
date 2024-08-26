/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List <Integer> sol = new ArrayList<>();
        if (root == null) return sol;
        Stack<Node> st = new Stack<>();
        st.add(root);

        while(!st.isEmpty()){
            Node currNode = st.pop();
            sol.add(currNode.val);

            for(Node child : currNode.children){
                st.add(child);
            }
        }

        Collections.reverse(sol);
        return sol;
    }
}