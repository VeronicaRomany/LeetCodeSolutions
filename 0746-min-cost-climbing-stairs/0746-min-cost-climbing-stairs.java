class Solution {
    private int minCostHelper(int [] cost , int start){
        int [] minCost = new int [cost.length+1];
        Arrays.fill(minCost,Integer.MAX_VALUE);
         minCost[0]=0;
         if(start==1)    minCost[1]=0;
             
         
        
        for(int i=start+1 ; i<minCost.length ; i++){
             if(minCost[i]==Integer.MAX_VALUE){
                 minCost[i] = cost[i-1];
             }else{
                 minCost[i] += cost[i-1];
             }
            
            if((i+1)<minCost.length ){
                if( minCost[i+1] == Integer.MAX_VALUE){
                     minCost[i+1]=minCost[i];
                }else{
                      minCost[i+1]=Math.min(minCost[i],minCost[i+1]);  
                }
            }
            
            if((i+2)<minCost.length){
                 if( minCost[i+2] == Integer.MAX_VALUE){
                     minCost[i+2]=minCost[i];
                }else{
                      minCost[i+2]=Math.min(minCost[i],minCost[i+2]);  
                }
            }
        }
        
        return Math.min(minCost[minCost.length-1],minCost[minCost.length-2]);
    }
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1)  return cost[0];
           
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        
        return Math.min(minCostHelper(cost,0) , minCostHelper(cost,1));
        
    }
}