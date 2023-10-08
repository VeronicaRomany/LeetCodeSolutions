class Solution {
    public int rob(int[] nums) {
        
        int [] maxProfit = new int [nums.length +1];
        maxProfit[0] = 0;
        maxProfit[1] = nums[0];
        
        for(int i=1 ; i<nums.length ; i++ ){
            maxProfit[i+1] = Math.max(nums[i] + maxProfit[i-1] , maxProfit[i]);
        }
        
        return maxProfit[maxProfit.length -1];
    }
}