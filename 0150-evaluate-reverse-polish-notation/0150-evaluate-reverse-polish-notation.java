class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> nums = new Stack();
        
        for(int i=0 ; i<tokens.length ;i++){
            if(tokens[i].equals("+" )|| tokens[i].equals("-" )|| tokens[i].equals("*" )|| tokens[i].equals("/" )){
                int num2 = nums.pop();
                int num1 = nums.pop();
                
                switch (tokens[i]){
                    case "+" :
                        nums.push(num1+num2);
                       break;
                      case "-" :
                        nums.push(num1-num2);
                      break;
                      case "*":
                        nums.push(num1*num2);
                        break;
                    case "/":
                        nums.push(num1/num2);
                        break;
                    default:
                        return 0 ;  
                }
                  
                
                
            }else{
                nums.push(Integer.parseInt(tokens[i]));
            }
            
        }
        
        return nums.pop();
        
        
    }
}