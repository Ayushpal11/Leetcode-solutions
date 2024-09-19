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
    public int findmax(TreeNode root, int [] maxi) {
        if (root == null) return 0;
        int leftsum = Math.max(0,findmax(root.left, maxi));
        int rightsum = Math.max(0,findmax(root.right, maxi));
        maxi[0] = Math.max(maxi[0], root.val+leftsum+rightsum);
        return Math.max(leftsum,rightsum)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        int [] maxi = {Integer.MIN_VALUE};
        findmax(root,maxi);
        return maxi[0];
    }
}