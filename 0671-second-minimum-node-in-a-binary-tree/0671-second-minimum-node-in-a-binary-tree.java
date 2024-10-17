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
    int second = -1;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null){
            return -1;
        }
        preorderdfs(root, root.val);
        return second;
    }
    public void preorderdfs(TreeNode root, int min){
        if (root == null){
            return;
        }
        if (root.val > min && (second == -1 || second > root.val)){
            second = root.val;
            return;
        }
        preorderdfs(root.left, min);
        preorderdfs(root.right, min);
    }
}