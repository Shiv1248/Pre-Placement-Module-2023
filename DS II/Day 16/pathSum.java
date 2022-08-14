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
    private int maxPathLen = 2000;
    private int[] path = new int[maxPathLen];
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        findAllPath(0, root, sum);
        return result;
    }

    private void findAllPath(int index, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path[index] = root.val;
        if (root.left == null && root.right == null && root.val == sum) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i <= index; i++) {
                list.add(path[i]);
            }
            result.add(list);
            return;
        }
        findAllPath(index + 1, root.left, sum - root.val);
        findAllPath(index + 1, root.right, sum - root.val);
    }
}