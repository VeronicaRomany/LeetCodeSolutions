class Solution {
    public int[] findArray(int[] pref) {
        
        int [] temp = new int [pref.length];
        temp[0] = pref[0];
        
        for(int i=1 ; i<pref.length ; i++){
            pref[i] ^= temp[i-1] ;
            temp[i] = temp[i-1] ^ pref[i];
        }
        System.gc();
        
        return pref;
    }
}