class Solution {
    public void sortColors(int[] nums) {
        
        int nOfZeros=0;
        int nOfOnes=0;
        int nOfTwos=0;
        
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]==0){
                nOfZeros++;
            }else if(nums[i] == 1){
                nOfOnes++;
            }else{
                nOfTwos++;
            }
        }
        
        int i=0;
        
        while(nOfZeros>0){
            nums[i++]=0;
            nOfZeros--;
        }
        
         while(nOfOnes>0){
            nums[i++]=1;
             nOfOnes--;
        }
        
         while(nOfTwos>0){
            nums[i++]=2;
             nOfTwos--;
        }
        
    }
}