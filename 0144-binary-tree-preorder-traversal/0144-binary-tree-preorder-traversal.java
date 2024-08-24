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
    List<Integer> list = new ArrayList<>();
    public void helper(TreeNode root, List<Integer> list){
        if (root == null) return;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root , list);
        return list;
    }
}