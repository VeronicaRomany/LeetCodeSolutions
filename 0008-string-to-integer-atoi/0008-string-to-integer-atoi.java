class Solution {
    public int myAtoi(String s) {
        
        char [] input = s.toCharArray();
        int index =0;
        int multiplier = 1;
        int sum=0;


        
        while(index < input.length && input[index]==' '){
            index++;
        }
        
        if(index < input.length  && input[index]=='+' ){
            index++;
            
        }else if(index < input.length  && input[index]=='-'){
            multiplier = -1;
            index++;
        }
        
        while(index<input.length && Character.isDigit(input[index])){
            
             if( (sum > Integer.MAX_VALUE / 10) ||    (sum == Integer.MAX_VALUE / 10 && (input[index] - '0') > 7) ) {

       
        return multiplier == 1? Integer.MAX_VALUE : Integer.MIN_VALUE ;
    }

            
            sum = sum * 10  ;
            sum = sum + (int) (input[index] - '0');
            
            index++;
        }
        
      
        return sum*multiplier;
        
    }
}