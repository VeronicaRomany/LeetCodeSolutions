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
   
     public void insert(TreeNode node , TreeSet<Integer> set)  {
       if (node == null)
            return;
 
        // First recur on left subtree
        insert(node.left , set);
 
        // Then recur on right subtree
       insert(node.right , set);
 
        // Now deal with the node
       set.add(node.val);
       
    }
 
    public TreeNode increasingBST(TreeNode root) {
         TreeSet<Integer> set = new TreeSet();
         insert(root , set);
       
         root = null;
         TreeNode current = null;
       
         for (Integer element : set) {
            TreeNode newNode = new TreeNode(element);

                if (root == null) {
                    root = newNode;
                    current = root;
                } else {
                    current.right = newNode;
                    current = newNode;
                }
            }

        
         return root;
    }
}