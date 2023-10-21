class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 2) return (nums[0]-1)*(nums[1]-1);
        
        int firstMax = nums[0];
        int firstMaxLocation = 0;
        int secondMax = 0;
        
        for(int i=1 ; i<nums.length ;i++){
            if(nums[i]>firstMax){
                firstMax = nums[i];
                firstMaxLocation = i;
            }
        }
        
        //System.out.println(firstMax);
        
        nums[firstMaxLocation] = 0 ;
        
        for(int i=1 ; i<nums.length ; i++){
            secondMax = Math.max(secondMax , nums[i]);
        }
       //  System.out.println(secondMax);
         
        return (firstMax-1) * (secondMax-1);
        
    }
}