/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode();
        ListNode ans = new ListNode();
        
        output = ans;
        int reminder = 0;
        
        while(l1 != null || l2 != null || reminder!=0){
            int sum = reminder + (l1 !=null ? l1.val : 0 ) + (l2 != null ? l2.val : 0);
            int value = sum % 10;
            reminder = sum / 10;
            
            ans.val = value;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
      
            if (l1 != null || l2 != null || reminder != 0) {
                ans.next = new ListNode(); 
                ans = ans.next; 
            }
        }
        
        if(reminder != 0){
            ans.val = reminder;
        }
        
        return output;
    }
}