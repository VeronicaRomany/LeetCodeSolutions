class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] producttill = new int [nums.length];
        int [] productBefore = new int [nums.length];
        
        producttill[0] = 1;
        productBefore[nums.length-1]=1;
        
        for(int i=1 ; i<producttill.length;i++){
            producttill[i] = producttill[i-1] * nums[i-1];
        }
        
        for(int i= productBefore.length-2 ; i>=0 ; i--){
            productBefore[i] = productBefore[i+1]*nums[i+1];
        }
        
        
         for(int i=0 ; i<producttill.length;i++){
            producttill[i] *= productBefore[i];
        }
        
        return producttill;
        
        
        
    }
}