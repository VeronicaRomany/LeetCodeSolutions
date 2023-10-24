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

class NodeAndLevel{
    TreeNode node;
    int level;
    
    NodeAndLevel( TreeNode newNode , int level ){
        this.node = newNode;
        this.level = level;
    }
}
class Solution {
    
   public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new LinkedList();

        
        List<Integer> largestValues = new ArrayList();
        Queue<NodeAndLevel> queue = new LinkedList();

        largestValues.add(root.val);
        if(root.right == null && root.left == null) return largestValues;
       
        NodeAndLevel Root = new NodeAndLevel(root, 0);
        queue.add(Root);
        
        int max = Integer.MIN_VALUE;
        int currentLevel =1;

        while (!queue.isEmpty()) {

            NodeAndLevel node = queue.remove();
            

            if (node.node.left != null) {
                NodeAndLevel nodeLeft = new NodeAndLevel(node.node.left, node.level + 1);
                if(nodeLeft.level > currentLevel){
                    largestValues.add(max);
                    max = Integer.MIN_VALUE;
                    currentLevel ++;
                }
                max = Math.max(max, nodeLeft.node.val);
                queue.add(nodeLeft);
            }

            if (node.node.right != null) {
                NodeAndLevel nodeRight = new NodeAndLevel(node.node.right, node.level + 1);
                if(nodeRight.level > currentLevel){
                    largestValues.add(max);
                    max = Integer.MIN_VALUE;
                    currentLevel ++;
                }
                max = Math.max(max, nodeRight.node.val);
                queue.add(nodeRight);
            }
        }

        largestValues.add(max);

        return largestValues;
    }
}
