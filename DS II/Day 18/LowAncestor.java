/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
        return root;
    }
    TreeNode l = lowestCommonAncestor(root.left, p, q);
    TreeNode r = lowestCommonAncestor(root.right, p, q);
    return l != null && r != null?root : l == null?r: l;
}

public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    if (root == p || root == q) {
        return root;
    }
    int count = leftCount(root.left, p, q);
    if (count == 0) {
        return lowestCommonAncestor(root.right, p, q);
    } else if (count == 2) {
        return lowestCommonAncestor(root.left, p, q);
    } else {
        return root;
    }
}

private int leftCount(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
        return 0;
    }
    if (root == p && root == q) {
        return 2;
    }
    if (root == p || root == q) {
        return 1 + leftCount(root.left, p, q) + leftCount(root.right, p, q);
    }
    return leftCount(root.left, p, q) + leftCount(root.right, p, q);
    }
}