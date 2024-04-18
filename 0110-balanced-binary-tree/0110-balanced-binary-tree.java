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
    private int getDepth(TreeNode root){
        if(root == null) return 0;
        
        // System.out.println(root.val);
        
        return 1 + Math.max( getDepth(root.left) , getDepth(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        
        int left = getDepth(root.left);
        
        // System.out.println("left subTree height " + left);
        
        
        int right = getDepth(root.right);
        
        // System.out.println("right subTree height " +right);
        
        if (Math.abs(left - right) <= 1  && isBalanced(root.left) && isBalanced(root.right) ){
            return true;
        }
        
        return false;
    }
}