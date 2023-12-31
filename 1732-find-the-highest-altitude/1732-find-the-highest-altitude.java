class Solution {
    public int largestAltitude(int[] gain) {
        int [] altitude = new int [gain.length+1];
        altitude[0] = 0;
        altitude[1] = gain[0];
        int max = Math.max(altitude[0] , altitude[1]);
        
        for(int i=2 ; i<altitude.length ; i++){
            altitude[i] = altitude[i-1] + gain[i-1];
            max = Math.max(max , altitude[i]);
        }
        return max;
        
       
    }
}