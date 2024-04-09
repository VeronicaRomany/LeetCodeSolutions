class Solution {
    public int[] twoSum(int[] nums, int target) {
   
        for(int i=0 ; i<nums.length;i++){
            int left = i;
            int right = nums.length-1;
            
            while(right>left){
                if(nums[left] + nums[right] == target){
                      return new int [] {left , right};
                }
                
                    right--;
                
            }
        }
       
        
        return new int [] {0,0};
        
    }
}