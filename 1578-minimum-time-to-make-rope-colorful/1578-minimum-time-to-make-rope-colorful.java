class Solution {
    public int minCost(String colors, int[] neededTime) {
        if(colors.length() == 1) return 0;
        
        int start = 0;
        int end = 0;
        
        char [] col = colors.toCharArray();
        
        int minTime =0;
        
        while( end < col.length){
            if(col[start]==col[end]){
                end++;
            }else{
                
                    int max = 0;
                    for(int i= start ; i<end ; i++){
                        minTime += neededTime[i];
                        max = Math.max(neededTime[i] , max);
                    }
                    minTime -=max;
                       
               
                    start = end;
                    end = start ;
                
            }
        }
        
         int max = 0;
                    for(int i= start ; i<end ; i++){
                        minTime += neededTime[i];
                        max = Math.max(neededTime[i] , max);
                    }
                    minTime -=max;
        
        return minTime;
        
    }
}