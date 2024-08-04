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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if(preorder.length==0 || inorder.length==0)  return null;
        
        TreeNode root = new TreeNode(preorder[0]);
        
        int middle=-1;
        
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                middle=i;
                break;
            }
        }
        
        int [] leftPre = Arrays.copyOfRange(preorder,1,middle+1);
        int [] leftIn = Arrays.copyOfRange(inorder,0,middle);
        
        root.left = buildTree(leftPre,leftIn);
        
        int [] rightPre = Arrays.copyOfRange(preorder,middle+1,preorder.length);
        int [] rightIn = Arrays.copyOfRange(inorder,middle+1,inorder.length);
        
        root.right = buildTree(rightPre,rightIn);
        
        return root;
        
        
    }
}