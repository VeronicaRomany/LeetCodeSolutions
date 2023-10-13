class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum = new int [nums.length];
        int totalSum = 0;
        
        for(int i=0 ; i<leftSum.length ; i++){
            leftSum [i] = totalSum;
            totalSum += nums[i];
        }
        
        for(int i=0 ; i<leftSum.length ; i++){
            leftSum[i] = Math.abs(totalSum - leftSum[i] - nums[i]);
            totalSum -= nums[i];
        }
        
        return leftSum;
        
        
        
    }
}