class Solution {
    public String largestGoodInteger(String num) {
        String s = "";
        char [] digit = num.toCharArray();
        
        for(int i=0 ; i< digit.length - 2 ; i++){
            
            if(digit[i] == digit[i+1] && digit[i+1]==digit[i+2]){
            
            
                if(s.length() == 0 || digit[i] > s.charAt(0)){
                    
                    s = num.substring(i,i+3);
                }
            }
        }
        
        return s;
        
    }
}