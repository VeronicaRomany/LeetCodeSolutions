class Solution {
    public int getMaximumGenerated(int n) {
        
        if(n<=1) return n;
        if(n==2) return 1;
        
        
        int max = 1;
        int i=1;
        int [] g = new int [n+1];
        g[0]=0;
        g[1]=1;
        
        for(i=1 ; i < (n/2) ; i++){
            g[2*i] = g[i];
            g[2*i + 1] = g[i] + g[i+1];
            max = Math.max(max ,g[2*i +1] );
           
        }
        
        if(n%2 != 0){
            g[n-1] = g[i];
            g[n] = g[i] + g[i+1];
            max = Math.max(max ,g[n] );
        }
        
        
       return max;   
    }
}