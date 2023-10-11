class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [nums.length];
        Arrays.fill(ans,0);
        
        int[] original = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        
        
        
        
        for(int i=0 ; i < original.length ; i++){
            for(int j=0 ; j<nums.length ; j++){
                if(nums[j] < original[i] ){
                    ans[i] ++;
                }else{
                    break;
                }
            }
        }
        
        return ans;
    }
}