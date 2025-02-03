class Solution {
    public boolean check(int[] nums) {
        if(nums.length < 2) return true;
        int numOfInversions = 0;

        for(int i=1 ; i<nums.length ; i++){
            if(nums[i-1] > nums[i]){
                numOfInversions++;
            }
        }

        if(nums[0] < nums[nums.length-1]){
             numOfInversions++;
        }

        return numOfInversions <= 1;
    }
}