class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        
        if(coins.length==1 ){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            return -1;
        } 
        
      
        
        int[] m = new int [amount+1];
        Arrays.fill(m, amount+1);
        m[0]=0;
        
        for(int i=1 ; i<m.length ; i++){
            for(int j=0 ; j<coins.length ; j++){
                if(i-coins[j]>=0){
                     m[i] = Math.min(m[i], 1+m[i-coins[j]]);
                } 
            }
        }
        
    
        
        return m[amount] != amount+1 ? m[amount] : -1;
        
    }
}