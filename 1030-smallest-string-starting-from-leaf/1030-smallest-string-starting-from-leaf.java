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
    public String smallestFromLeaf(TreeNode root) {
        PriorityQueue<String> hpp = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        dfs(root, hpp, sb);
        return hpp.poll();
    }
    private static void dfs(TreeNode root, PriorityQueue<String> hpp, StringBuilder sb){
        if (root == null) return;
        if (root.left == null && root.right == null){
            sb.insert(0,(char)(root.val+'a'));
            hpp.offer(sb.toString());
            sb.deleteCharAt(0);
            return;
        }
        sb.insert(0,(char)(root.val+'a'));
        dfs(root.left, hpp, sb);
        dfs(root.right, hpp, sb);
        sb.deleteCharAt(0);
    }
}