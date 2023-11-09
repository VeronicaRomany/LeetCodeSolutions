class Solution {
    
    static final int MODULO =  (int) 1e9 + 7;
    
    public int countHomogenous(String s) {

        long temp = 1;
        long homogenousCount=0;
        char[] charArray = s.toCharArray();
        for(int i=1 ; i<s.length(); i++){
            if(charArray[i] == charArray[i-1]){
                temp ++;
            }else{
               
                
                homogenousCount = (homogenousCount + (temp*(temp+1)/2))% MODULO;
                
                temp = 1;
             
            }
        }
        
       
      

        homogenousCount = (homogenousCount + (temp*(temp+1)/2))% MODULO; 

        return (int) homogenousCount ;
    }
}