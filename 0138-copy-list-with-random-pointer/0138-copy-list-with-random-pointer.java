/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
       if(head == null) return null;
        
        Node current = head;
        
        // Step 1: Create a new copy node for each original node and place it right next to the original node
        while(current != null) {
            Node currentCopy = new Node(current.val);
            Node originalNext = current.next;
            
            current.next = currentCopy;
            currentCopy.next = originalNext;
            
            current = originalNext;
        }
        
        // Step 2: Assign random pointers for the copied nodes
        current = head;
        while(current != null) {
            if(current.random != null) {
                current.next.random = current.random.next;
            } else {
                current.next.random = null;
            }
            current = current.next.next;
        }
        
        // Step 3: Restore the original list and extract the copied list
        current = head;
        Node newHead = head.next;
        while(current != null) {
            Node currentCopy = current.next;
            current.next = currentCopy.next;
            if(currentCopy.next != null) {
                currentCopy.next = currentCopy.next.next;
            }
            current = current.next;
        }
        
        return newHead;
    }
        
        
        
//         HashMap<Node,Node> hash = new HashMap();
        
//         Node current = head;
        
//         while(current !=null){
//             Node copy = new Node(current.val);
//             hash.put(current , copy);
//             current = current.next;
//         }
        
//         for(Map.Entry<Node,Node> entry : hash.entrySet()){
//             Node original = entry.getKey();
//             Node copy = entry.getValue();
            
//             copy.next = hash.get(original.next);
//             copy.random = hash.get(original.random);
//         }
        
//         return hash.get(head);
        
    }
