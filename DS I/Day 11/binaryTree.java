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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new LinkedList<>();
        levelOrder(root,lst, 0);
        return lst;
    }
    
    public void levelOrder(TreeNode root, List<List<Integer>> lst, int level){
        if(root == null) return;
        if(lst.size() <= level){
            lst.add(level,new LinkedList<Integer>());
        }
        lst.get(level).add(root.val);
        levelOrder(root.left, lst, level + 1);
        levelOrder(root.right, lst, level + 1);
    }
}