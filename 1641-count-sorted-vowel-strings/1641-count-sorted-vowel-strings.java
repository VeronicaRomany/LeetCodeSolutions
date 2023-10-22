class Solution {
    public int countVowelStrings(int n) {
        int [][] dp = new int [n+1][5];
        Arrays.fill(dp[0],0);
        Arrays.fill(dp[1],1);
        
        for(int i=2 ; i<=n ; i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4];
            dp[i][1] = dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4];
            dp[i][2] = dp[i-1][2] + dp[i-1][3] + dp[i-1][4];
            dp[i][3] = dp[i-1][3] + dp[i-1][4];
            dp[i][4] =  dp[i-1][4];
        }
        
        int sum =0;
        
        for(int i=0 ; i<5;i++){
            sum+=dp[n][i];
        }
        return sum;
    }
}