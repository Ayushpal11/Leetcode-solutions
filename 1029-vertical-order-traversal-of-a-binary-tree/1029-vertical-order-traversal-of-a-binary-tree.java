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
    class Pair{
        TreeNode val;
        int row;
        int col;
        Pair(TreeNode v, int r, int c){
            val = v;
            row = r;
            col = c;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        List<List<Integer>> lis = new ArrayList<>();
        queue.add(new Pair(root, 0, 0));

        TreeMap<Integer, List<int[]>> mpp = new TreeMap<>();
        while (!queue.isEmpty()){
            Pair curr = queue.poll();
            TreeNode currNode = curr.val;
            int currRow = curr.row;
            int currCol = curr.col;

            mpp.putIfAbsent(currCol, new ArrayList<>());
            mpp.get(currCol).add(new int []{currNode.val, currRow});
            if (currNode.left !=null){
                queue.add(new Pair(currNode.left, currRow + 1, currCol - 1));
            }
            if (currNode.right != null){
                queue.add(new Pair(currNode.right, currRow + 1, currCol + 1));
            }
        }
        for (int col : mpp.keySet()){
            List<int[]> colNodes = mpp.get(col);
            Collections.sort(colNodes, (a,b) -> a[1] ==b[1] ? a[0] - b[0] : a[1] - b[1]);
            List<Integer> sortedCol = new ArrayList<>();
            for(int [] tup: colNodes){
                sortedCol.add(tup[0]);
            }
            lis.add(sortedCol);
        }
        return lis;
    }
}