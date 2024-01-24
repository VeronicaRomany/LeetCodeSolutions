class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int [] ans = {-1,-1};
        
        int left=0;
        int right=nums.length-1;
        
        
        while(left<=right){
            int mid = (left+right)/2;
            
            
            if(target > nums[mid]){
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid -1;
            }else{
                //todo
                
                int leftPt = mid-1;
                int rightPt = mid +1;
                
                while(leftPt>=0 && nums[leftPt] == target) leftPt--;
                
                while(rightPt<nums.length && nums[rightPt] == target) rightPt++;
                
               
                
                ans[0] = leftPt+1;
                ans[1] = rightPt-1;
                
                return ans;
            }
        }
        
        return ans;
        
    }
}