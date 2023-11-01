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
    public void traverse(TreeNode root , HashMap <Integer,Integer> hash){
        if(root== null) return ;
        
        if(hash.containsKey(root.val)){
            hash.put(root.val , hash.get(root.val)+1);
        }else{
            hash.put(root.val , 1);
        }
        
        traverse(root.left , hash);
        traverse(root.right, hash);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hash = new HashMap();
        ArrayList <Integer> arraylist = new ArrayList();
        int max = Integer.MIN_VALUE;
        
        traverse(root,hash);
        
         for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
             //int value = entry.getValue();
             max = Math.max(max , (int)entry.getValue());
         }
        
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
             if((int)entry.getValue()==max)      arraylist.add(entry.getKey());
         }
        
        int [] sol = new int [arraylist.size()];
        for(int i=0 ; i<sol.length;i++){
            sol[i] = arraylist.get(i);
        }
        
        System.gc();
        return sol;
        
    }
}