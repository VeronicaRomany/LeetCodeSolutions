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

class Node{
    public TreeNode node ;
    public int level;
    
    public Node(TreeNode node , int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> answer = new ArrayList<>();
        
        if(root == null) return answer;
        
        Queue<Node> q = new LinkedList();
        
        q.add(new Node(root , 0));
        
        while(!q.isEmpty()){
            Node current = q.poll();
            
              // Ensure that the answer list has enough levels
            while (answer.size() <= current.level) {
                answer.add(new ArrayList<>());
            }
            
            // Add the current node value to its corresponding level
            answer.get(current.level).add(current.node.val);
            
            
            
            if(current.node.left !=null){
                q.add(new Node(current.node.left , current.level+1));
            }
            
            if(current.node.right !=null){
                 q.add(new Node(current.node.right , current.level+1));
            }
            
        }
        
        return answer;
        
        
    }
}