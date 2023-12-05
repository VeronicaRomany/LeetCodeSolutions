class Solution {
    public int numberOfMatches(int n) {
        
        int numberOfMatches = 0;
        
        while(n!=1){
            if(n%2 == 0){
                numberOfMatches += n/2;
                n /= 2;
            }else{
                numberOfMatches += (n-1)/2;
                n = (n-1)/2 + 1;
            }
        }
        
        return numberOfMatches;
        
    }
}