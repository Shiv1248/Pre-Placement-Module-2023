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
 
    public void in(TreeNode root,ArrayList<Integer> arr){
           if(root==null)return;
           in(root.left,arr);
           arr.add(root.val);
           in(root.right,arr);
       }
       public boolean findTarget(TreeNode root, int k) {
            ArrayList<Integer> arr=new ArrayList<>();
            in(root,arr);
            int s=0;
            int e=arr.size()-1;
            while(s<e){
                int sum=arr.get(s)+arr.get(e);
                if(sum==k){
                    return true;
                }
                else if(sum>k){
                    e--;
                }
                else{
                    s++;
                }
            }
           return false;
       }
   }