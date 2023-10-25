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
       public void printInorder(TreeNode node , List<Integer> t){
        if (node == null)
            return;
 
        // First recur on left child
        printInorder(node.left,t);
 
        // Then print the data of node
        t.add(node.val);
 
        // Now recur on right child
        printInorder(node.right,t);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> traverse = new ArrayList();
        printInorder(root,traverse);
        
        return traverse;
        
    }
}