/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Takes root of unbalancedbst as input calls build to construct
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        InOrder(root, list);
        return build(list, 0, list.size()-1);
    }
    // Recursive in-order traversal
    public void InOrder(TreeNode root, List<Integer> list){
        if (root == null)return;
        InOrder(root.left,list);
        list.add(root.val);
        InOrder(root.right,list);
    }
    // Starting index for the current subtree.
    // Ending index for the current subtree.
    // Constructs a balanced BST from the sorted list of values
    // 
    public TreeNode build(List<Integer> list, int start,int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = build(list, start, mid - 1);
        node.right = build(list, mid + 1,end);
        return node;
    }
}