class Solution {
    public int maxProductDifference(int[] nums) {
     
        
       int max = 0;
       int min = Integer.MAX_VALUE;
        
        int k=0;
        int j=0;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
                k=i;
            }
            
            if(nums[i] < min){
                min = nums[i];
                j=i;
            }
        }
        
        nums[k]= 0;
        nums[j]= 0;
        
        int smax = 0;
        int smin = Integer.MAX_VALUE;
        
         for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > smax){
                smax = nums[i];
               
            }
            
            if(nums[i] < smin && nums[i] > 0){
                smin = nums[i];
              
            }
        }
        
        return max*smax - min*smin;
        
    }
}