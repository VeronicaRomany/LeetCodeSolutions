class Solution {
    public int findSpecialInteger(int[] arr) {
        
        if(arr.length == 1) return arr[0];
        int counter = 1;
        
        double factor = 0.25 * arr.length;
        
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]==arr[i-1]){
                counter ++;
            }else{
                counter = 1;
            }
            
            if(counter > factor){
                return arr[i];
            }
        }
        
        return 0;
        
        
    }
}