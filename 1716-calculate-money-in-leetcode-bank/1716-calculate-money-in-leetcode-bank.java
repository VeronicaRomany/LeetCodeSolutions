class Solution {
    public int totalMoney(int n) {
        
        int start = 1;
        int end = 7;
        int sum = 0;
        
        while(n>7){
            sum += 7*(start+end)/2;
           
            start++;
            end++;
            n -=7;
        }
        
        end = start + n - 1;
        sum += n*(start+end)/2;
        
        return sum;
        
        
        
    }
}