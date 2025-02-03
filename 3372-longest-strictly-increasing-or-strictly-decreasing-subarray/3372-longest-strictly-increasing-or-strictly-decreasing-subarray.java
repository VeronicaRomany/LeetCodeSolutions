class Solution {
    private int getLongestIncreasing(int[] nums, int i){
        int max = 1;

        while(i+1 < nums.length && nums[i+1] > nums[i]){
            max++;
            i++;
        }
        
        return max;
    }

    private int getLongestDecreasing(int[] nums, int i){
        int max = 1;

        while(i+1 < nums.length && nums[i+1] < nums[i]){
            max++;
            i++;
        }
            
        return max;
    }


    public int longestMonotonicSubarray(int[] nums) {

        int maxLongest = 1;

        for(int i=0 ; i < nums.length ; i++){

            int maxBetweenIncreasingAndDecreasing = Math.max(getLongestDecreasing(nums,i),
                                                             getLongestIncreasing(nums,i));

            maxLongest = Math.max(maxLongest, maxBetweenIncreasingAndDecreasing )  ;                                               

        }

        return maxLongest;
    }
}