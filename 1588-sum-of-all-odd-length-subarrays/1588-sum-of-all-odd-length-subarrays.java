class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum=0;
        int [] sums = new int [arr.length +1];
        sums[0]=0;
        sums[1]=arr[0];
        
        for(int i=2 ; i<sums.length ; i++){
            sums[i] = sums[i-1] + arr[i-1];
        }
        
        for(int k=1 ; k<sums.length; k+=2 ){
            
            for(int i=k ; i<sums.length ; i++){
                totalSum += sums[i] - sums[i-k];
            }
            
        }
        
        return totalSum;
    }
}