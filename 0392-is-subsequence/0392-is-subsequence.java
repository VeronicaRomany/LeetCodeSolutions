class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int start = 0;
        
        for(int i=0 ; i<s.length(); i++){
            boolean isFounded = false;
         //   System.out.println(s.charAt(i));
            
            while(start < t.length()){
           //     System.out.println(start);
                if(s.charAt(i) == t.charAt(start)){
                    isFounded = true;
                    start = start+1;
                    break;
                }else{
                    start ++;
                }
            }
            
            if(!isFounded) return isFounded;
            
        }
        
        return true;
        

        
        
    }
}