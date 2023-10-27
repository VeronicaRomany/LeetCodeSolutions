class Solution {
    public String LongestPalindromAtcertainPoint(String s , int left , int right , String res){
        int resultLength = res.length();
       
        
        return res;
    }
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        
        
        String res = "";
        int resultLength = 0;

        int left = 0;
        int right = 0;

       
        
        for(int i=0 ; i< s.length() ; i++){
            // odd length
            left = i;
            right = i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                
                if((right-left + 1) > resultLength){
                    resultLength = right-left+1;
                    res = s.substring(left, right+1);
                    System.out.println(res);
                }
                
                left--;
                right++;
                
            }
            
            left = i;
            right = i+1;
               while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                
                if((right-left + 1) > resultLength){
                    resultLength = right-left+1;
                    res = s.substring(left, right+1);
                    System.out.println(res);
                }
                
                left--;
                right++;
                
            }
            
        }
        
        return res;
       
        
     
        
    }
}