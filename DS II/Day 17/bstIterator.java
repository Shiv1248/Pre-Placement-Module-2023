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
class BSTIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();
 
 private void refreshStack(TreeNode iter){
      while(iter != null){
          stack.push(iter);
          iter = iter.left;
      }
 }
     
 public BSTIterator(TreeNode root) {
    this.refreshStack(root);
 }
 
 
 public boolean hasNext() {
     return !(stack.isEmpty());
 }
 
 
 public int next() {
     TreeNode node = stack.pop();
     if(node != null){
         this.refreshStack(node.right);
         return node.val;
     }
     
     return -1; 
 }
 }
 
 /**
  * Your BSTIterator object will be instantiated and called as such:
  * BSTIterator obj = new BSTIterator(root);
  * int param_1 = obj.next();
  * boolean param_2 = obj.hasNext();
  */