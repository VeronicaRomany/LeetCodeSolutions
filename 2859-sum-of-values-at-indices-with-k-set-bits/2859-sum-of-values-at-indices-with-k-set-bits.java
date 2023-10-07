class Solution {
    private boolean isThisNumberHasKSetBits(int x, int k){
        int setNums = 0 ;
        
        while(x!=0){
            if( (x & 1) == 1){
                setNums ++;
            }
            
            if(setNums>k){
                    return false;
            } 
            
            x = x >> 1; 
        }
        
        return setNums == k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        
        for(int i=0 ; i<nums.size();i++){
            if(isThisNumberHasKSetBits(i,k)) count+=nums.get(i);
        }
        
        return count;
        
    }
}