class Solution {
    private boolean isEven(int n){
        return (n & 1) == 0;
    }

    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        
        for(int i=1 ; i<nums.length ; i++){

            if ((isEven(nums[i]) && isEven(nums[i-1]))
                 || ! (isEven(nums[i]) || isEven(nums[i-1])) ){
                return false;
            }
        }

        return true;
    }
}