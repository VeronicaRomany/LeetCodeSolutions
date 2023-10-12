class Solution {
    public int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0 ; i<nums.length ; i++){
            int currentProduct = nums[i];
            max = Math.max(max , currentProduct);
            for(int j=i+1 ; j<nums.length ; j++){
                currentProduct *= nums[j];
                max = Math.max(max , currentProduct);
            }
        }
        
        return max;
        
    }
}