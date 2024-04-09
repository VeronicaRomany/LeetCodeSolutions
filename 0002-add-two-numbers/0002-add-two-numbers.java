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
        
        while(l1 != null && l2 != null){
            int sum = reminder + l1.val + l2.val;
            int newCellVal = sum % 10;
            reminder = sum / 10;
            
            System.out.println("val " + newCellVal + " rem " + reminder);
            
            ans.val = newCellVal;
            
            // System.out.println("in output" + ans.val);
          
            
            l1 = l1.next;
            l2 = l2.next;
            
            if(l1 !=null && l2 !=null){
                  ans.next = new ListNode();
                  ans = ans.next;
            }
            
        }
        
        if(l1 !=null || l2 !=null){
            ans.next = new ListNode();
            ans = ans.next;
        }
        
        while(l1 != null){
            // System.out.println("in l1 not empty");
            int sum = reminder + l1.val;
            int newCellVal = sum % 10;
            reminder = sum / 10;
            
            ans.val = newCellVal;
       
            
            l1 = l1.next;
            
            if(l1 !=null){
                  ans.next = new ListNode();
                  ans = ans.next;
            }
          
            
        }
        
        while(l2 !=null){
             // System.out.println("in l2 not empty");
            int sum = reminder + l2.val;
            int newCellVal = sum % 10;
            reminder = sum / 10;
            
            ans.val = newCellVal;
            
            
            l2 = l2.next;
            
            
            if(l2 !=null){
                ans.next = new ListNode();
                ans = ans.next;
            }
            
        }
        
        if(reminder !=0){
            ans.next = new ListNode();
            ans = ans.next;
            // System.out.println("last reminder is = " + reminder);
            ans.val= reminder;
          
        }
        

        
        return output;
    }
}