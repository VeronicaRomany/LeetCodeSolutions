class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0 ) return false;
    
        int mask = 1;
        int temp = 0;
        int zerosCount = 0;
        
        while(n != 1){
            
            temp = mask & n;
            n = n >> 1;
            
           if( temp != 0 ) return false ;
           zerosCount++;
        }
        
        if(zerosCount%2 == 0)  return true;
           
        
        return false;
    }
}