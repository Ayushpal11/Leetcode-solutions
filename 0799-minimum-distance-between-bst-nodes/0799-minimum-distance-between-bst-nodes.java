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
    List<Integer> sol = new ArrayList<>();
    public void inorderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        inorderTraversal(root.left);
        sol.add(root.val);
        inorderTraversal(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorderTraversal(root);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<sol.size() - 1; i++){
            int min2 = sol.get(i + 1) - sol.get(i);
            if(min2 < min){
                min = min2;
            }
        }
        return min;
    }
}