class Solution {
    int [][] dp ;
    
    private int maxSub(int[] nums , int start , int end ){
        int len = 1;
        
        if(end >= nums.length){
            return len;
        }
        
        if(dp[start][end] !=-1){
            return dp[start][end];
        }
        
        if(nums[end] > nums[start]){
            
            dp[start][end] = Math.max( 1 + maxSub(nums, end , end+1) ,  maxSub(nums, start , end+1) );
            return dp[start][end];
        }
            
        
        return dp[start][end] = maxSub(nums, start , end+1);
    
    }
    
    public int lengthOfLIS(int[] nums) {
        
        dp = new int [nums.length][nums.length];
        
        for(int i=0 ; i<nums.length ;i++){
             Arrays.fill(dp[i] , -1);
        }
       
        
        int max=1;
        
        for(int i=0 ; i<nums.length-1 ; i++){
            
            max = Math.max(max , maxSub(nums,i,i+1) );
        }
        
        return max;
        
    }
}