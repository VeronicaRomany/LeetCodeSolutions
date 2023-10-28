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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        if(cloned == null && original == null) return null ;
        
        TreeNode res = null;
        
        if(target.val == cloned.val ) {
            res = cloned; 
          
        }else{
          TreeNode left = getTargetCopy(original.left , cloned.left , target);
            if(left != null && left.val == target.val)  return left;
          TreeNode right = getTargetCopy(original.right , cloned.right , target);
            if(right!=null && right.val == target.val)  return right;
        }
         
        
        return res;
        
        
    }
}