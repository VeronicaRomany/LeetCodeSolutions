class Solution {
    
    static final int MODULO =  (int) 1e9 + 7;
    
    public int countHomogenous(String s) {

        String temp = Character.toString(s.charAt(0));
        long homogenousCount=0;
        
        for(int i=1 ; i<s.length(); i++){
            if(s.charAt(i) == temp.charAt(temp.length()-1)){
                temp += s.charAt(i);
            }else{
               
                long n = temp.length();
                homogenousCount = (homogenousCount + (n*(n+1)/2))% MODULO;
                
                temp = Character.toString(s.charAt(i));
             
            }
        }
        
       
        long n = temp.length();

        homogenousCount = (homogenousCount + (n*(n+1)/2))% MODULO; 

        return (int) homogenousCount ;
    }
}