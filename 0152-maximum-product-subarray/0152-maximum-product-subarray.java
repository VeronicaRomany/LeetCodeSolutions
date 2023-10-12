class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int max = Integer.MIN_VALUE;
        int [] maxProduct = new int [nums.length +1];
        int [] minProduct = new int [nums.length +1];
        
        maxProduct[0] = minProduct[0] = 1 ;
        
        for(int i=1 ; i< maxProduct.length ; i++){
            if(nums[i-1]>0){
                maxProduct [i] = Math.max(maxProduct[i-1]*nums[i-1] ,nums[i-1] );
                minProduct [i] = Math.min(minProduct[i-1]*nums[i-1] ,nums[i-1]);
                
            }else{
                maxProduct [i] = Math.max(minProduct[i-1]*nums[i-1] , nums[i-1]);
                minProduct [i] = Math.min(maxProduct[i-1]*nums[i-1] , nums[i-1]);
            }
            max = Math.max(max,maxProduct[i]);
            
        }
        
       
        
        return max;
    }
}