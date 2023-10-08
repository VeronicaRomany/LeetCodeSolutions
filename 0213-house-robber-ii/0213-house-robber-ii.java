class Solution {
    
    public int robTrial(int [] nums , int start , int end){
        
        int [] maxProfit = new int [nums.length +1];
        maxProfit[0] = 0;
        
        if(start == 0){
            maxProfit[1] = nums[0];
        }else{
            maxProfit[1] = 0;
            maxProfit[2] = nums[1];
        }
        
        for(int i=start+1 ; i<= end ; i++ ){
            maxProfit[i+1] = Math.max(nums[i] + maxProfit[i-1] , maxProfit[i]);
        }
        
        return maxProfit[end+1];
                
    }
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        if(nums.length == 2) return Math.max(nums[0] , nums[1]);
        
        return Math.max( robTrial(nums , 0 , nums.length-2) , 
                         robTrial(nums , 1 , nums.length-1) );
    }
}