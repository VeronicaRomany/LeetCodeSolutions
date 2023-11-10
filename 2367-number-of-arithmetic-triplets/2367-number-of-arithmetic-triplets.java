class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int tripleCount=0;
        
        for(int i=0 ; i< nums.length-2 ; i++){
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                if(nums[left] - nums[i] == diff &&  nums[right]-nums[left] == diff){
                 //   System.out.println(i+" "+left+" "+right);
                    tripleCount++;
                    break;
                }
                if(nums[left]-nums[i]<diff || nums[right]-nums[left]<diff){
                    left++;
                }else if(nums[right]-nums[left]>=diff){
                    right--;
                }
                
               
            }
        }
        
        
        return tripleCount;
        
    }
}