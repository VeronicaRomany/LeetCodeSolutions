/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start = 1;
        
        while(start<n){
            
            int mid = start + (n-start)/2;
            
            if( !isBadVersion(mid)) {
                start = mid+1;
            }else{
                n = mid;
            }
            
        }
        
        return start;
        
    }
}