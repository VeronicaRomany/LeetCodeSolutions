class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet();
        
        for(int i=0 ; i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int maxLen = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            
            int currentnumber = nums[i];

            if(!set.contains(currentnumber-1)){
                int len = 1;
                
                while(set.contains(currentnumber+len)){
                    len++;
                }
                maxLen = Math.max(len , maxLen);
            }
            
            
        }
        
        return maxLen;
        
    }
}