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
          res = getTargetCopy(original.left , cloned.left , target);
            if(res != null && res.val == target.val)  return res;
          res = getTargetCopy(original.right , cloned.right , target);
            if(res !=null && res.val == target.val)  return res;
        }
         
        
        return res;
        
        
    }
}