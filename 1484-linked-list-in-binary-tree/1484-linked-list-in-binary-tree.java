/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    // public boolean isSubPath(ListNode head, TreeNode root) {
    //     return helper(head,root,true);
    // }
    // public boolean helper(ListNode head, TreeNode root, boolean start){
    //     if (root == null) return false;
    //     if (head.val == root.val){
    //         if (head.next == null) return true;
    //         if (helper(head.next,root.left,false)||helper(head.next,root.right,false)) return true;
    //     }

    //     return start == true ?(helper(head,root.left,true)||helper(head,root.right,true)): false;
    // }

    //DFS

    public boolean isSubPath(ListNode head, TreeNode root){
        if (root == null) return false;
        return(
            dfs(root, head) || isSubPath(head, root.left) || isSubPath(head, root.right)
        );
    }
    private boolean dfs(TreeNode root, ListNode head){
        if (head == null) return true;
        if (root == null) return false;
        if (root.val != head.val) return false;
        return dfs(root.left, head.next) || dfs(root.right, head.next);
    }
}