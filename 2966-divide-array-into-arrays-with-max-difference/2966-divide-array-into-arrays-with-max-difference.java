class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);
    
        int numOfArrays =  nums.length / 3 ;
        
        int [][] answer = new int [numOfArrays][3];
        
        int index = 0;
        
        for(int i=0 ; i< answer.length ; i++){
            for(int j=0 ; j< answer[0].length ;j++){
                answer[i][j] = nums[index++];
                
                if(j==2 && (answer[i][j] - answer[i][j-2])>k){
                    
                    return new int [0][0];
                }
            }
        }
        
        return answer;
        
    }
}