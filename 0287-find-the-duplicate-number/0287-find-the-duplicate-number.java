class Solution {
    public int findDuplicate(int[] nums) {
        int [] dups = new int [nums.length];
        
        for(int num : nums){
            // System.out.println(num);
            // System.out.println(dups[num]);
            if(dups[num]==1) return num;
            
            dups[num]++;
        }
        
        return 0;
       
    }
}