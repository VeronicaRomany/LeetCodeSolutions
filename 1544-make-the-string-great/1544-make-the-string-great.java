class Solution {
    public String makeGood(String s) {
        
        char [] array = s.toCharArray();
        
        Stack<Character> stack = new Stack();
        stack.push(array[0]);
        
        for(int i=1 ; i< array.length;i++ ){
            if(stack.isEmpty()){
                stack.push(array[i]);
                continue;
            }
            boolean firstIsUpper = Character.isUpperCase(stack.peek());
            
            boolean secondIsUpper = Character.isUpperCase(array[i]);
            
            if(Math.abs( (int) (stack.peek()) - (int) (array[i])) != 32 ){
                // System.out.println(stack.peek() + " " + array[i] + " " +"Not same char");
                stack.push(array[i]);
            }else{
                
                if( ( firstIsUpper && secondIsUpper ) || ( !firstIsUpper && !secondIsUpper ) ){
                    // System.out.println(stack.peek() + " " + array[i] + " " +"same size");
                    stack.push(array[i]);
                }else{
                    
                     stack.pop();
                 
                    
                }
                
                
            }
            
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the stack and append each element to the StringBuilder
        for (Character ch : stack) {
            sb.append(ch);
        }
        
        // Convert StringBuilder to String and return
        return sb.toString();
        
    }
}