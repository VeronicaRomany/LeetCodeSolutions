class Solution {
    
   

    
    public int countKDifference(int[] nums, int k) {
        int c=0;
        Arrays.sort(nums);
      
            for(int j=nums.length-1 ; j>=0 ; j--){
                for(int i=0 ; i<nums.length ; i++){
                    if(nums[j]-nums[i]==k){
                        c++;
                    }else if(nums[j]-nums[i]<k){
                        break;
                    }
            }
        }
        
        return c;
        
    }
}