class MinStack {
    
    Stack<Integer> stack;
    PriorityQueue<Integer> pq;
   

    public MinStack() {
        stack= new Stack();
        pq=new PriorityQueue();
       
    }
    
    public void push(int val) {
        stack.push(val);
        pq.add(val);
        
    }
    
    public void pop() {
        pq.remove(stack.pop());
    }
    
    public int top() {
      return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
//         Stack<Integer> s = new Stack();
//         int min = Integer.MAX_VALUE;
        
//         while(!stack.isEmpty()){
//             if(stack.peek() < min){
//                 min = stack.peek();
//             }
            
//             s.push(stack.pop());
//         }
        
//         while(!s.isEmpty()){
//             stack.push(s.pop());
//         }
        
//         return min;
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