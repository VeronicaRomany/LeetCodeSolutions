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
    boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
      
        if (q == null && p == null)
            return  true;
        
        if(q==null || p==null || p.val != q.val ) return isSame = false;
 
    
         isSameTree(p.left , q.left);
         isSameTree(p.right , q.right);
        
        return isSame;
     
        
    }
}