class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int maxFreq =0;
        int sol=0;
        int [] freq = new int[101];
        
        for(int i=0 ; i<nums.length;i++){
            freq[nums[i]]++;
            
            maxFreq=Math.max(maxFreq,freq[nums[i]]);
        }
        
        for(int i=0 ;i<freq.length;i++){
            if(freq[i]==maxFreq)    sol+=freq[i];
        }
        
        return sol;
        
    }
}