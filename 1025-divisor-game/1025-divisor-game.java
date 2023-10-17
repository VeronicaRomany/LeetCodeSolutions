class Solution {
    
  
    public boolean divisorGame(int n) {
        
        boolean [] mem = new boolean[n+1];
        
        mem[0] = false;
        mem[1] = false;
        
        for(int i=2 ; i< mem.length ; i++){
            for(int j=1 ; j<i ; j++){
                if(i%j==0 && mem[i-j]==false){
                    mem[i]=true;
                }
            }
        }
        
        return mem[n];
        
    }
}