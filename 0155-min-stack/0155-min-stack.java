  class Node{
        public int val;
        public int min;
        public Node next;
        
        public Node(int v , int m , Node n){
            this.val = v;
            this.min = m;
            this.next = n;
        }
    }


class MinStack {
    
    private Node head;


    public MinStack() {
        this.head = null;
    }
    
    public void push(int val) {
        if(head == null){
            head = new Node(val , val , null);
        }else{
            
            Node temp = new Node(val , head.min , head);
            
            if(temp.val < head.min ){
                temp.min = temp.val;
            }
            
            head = temp;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
         return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */