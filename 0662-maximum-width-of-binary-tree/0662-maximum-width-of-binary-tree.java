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
    private int helper(TreeNode node, int level, int index , HashMap<Integer , Integer> map){
        if(node == null) return 0;
        if(!map.containsKey(level)){
            map.put(level,index);
        }
        int curr = index - map.get(level) + 1;
        int left = helper(node.left, level+1, index * 2 - 1, map);
        int right = helper(node.right, level+ 1, index * 2, map);
        return Math.max(curr,Math.max(left,right));

    }

     public int widthOfBinaryTree(TreeNode root) {
        return helper(root, 0, 1, new HashMap<>());

    //     int res = 0;
    //     Queue<Pair<TreeNode , Integer>> q = new LinkedList<>();
    //     q.add(new Pair<>(root,0));
    //     while (!q.isEmpty()){
    //         int size = q.size();
    //         int first = 0;
    //         int last = 0;
    //         int min = q.peek().getValue();
    //         for (int i=0; i<size; i++){
    //             int curr = q.peek().getValue() - min;
    //             TreeNode node = q.peek().getKey();
    //             q.poll();

    //             if (i == 0){
    //                 first = curr;
    //             }
    //             if (i == q.size()-1){
    //                 last = curr;
    //             }
    //             if (node.left != null){
    //                 q.add(new Pair<>(node.left, curr * 2 + 1));
    //             }
    //             if (node.right != null){
    //                 q.add(new Pair<>(node.right, curr * 2 + 2));
    //             }
    //         }
    //         res = Math.max(res, last - first + 1);
    //     }
    //     return res;
    }
}