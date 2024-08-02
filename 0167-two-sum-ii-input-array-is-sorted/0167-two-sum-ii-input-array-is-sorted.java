class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        
        int start = 0;
        int end = numbers.length-1;
        
        
        while(start<end){
            
           int sum = numbers[start]+numbers[end];
            int mid = (start+end)/2;
 
            if(sum == target) return new int []{start+1, end+1};
            
            else if(sum<target){
                if(numbers[mid] + numbers[end]<target)  start= mid;
                
                else{
                     start++;
                }
               
            } 
            
            else{
                 if(numbers[mid] + numbers[start]>target)  end= mid;
                
                else{
                           end --;
                }
         
                
            } 
            
            
            // if(numbers[mid]>target) end = mid;
            
            
            
        }
        
        return new int [0];
        
    }
}