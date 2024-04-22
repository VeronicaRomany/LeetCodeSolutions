class Solution {
    public void moveZeroes(int[] nums) {
        
        int zeroPtr=0;
        int elePtr=0;
        int n=nums.length;
        
        while(zeroPtr< n && elePtr<n){
            
            while(zeroPtr<(n-1) && nums[zeroPtr]!=0){
                zeroPtr++;
            }
            
            while(elePtr<(n-1) && (nums[elePtr]==0 || elePtr<zeroPtr)){
                elePtr++;
            }
            
            int temp = nums[zeroPtr];
            nums[zeroPtr] = nums[elePtr];
            nums[elePtr] = temp;
            
            elePtr++;
            zeroPtr++;
        }
        
      
        
    }
}