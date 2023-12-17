class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int [] onesRow = new int [m];
        int [] onesCol = new int [n];
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                    grid[i][j] = 2*(onesRow[i]+onesCol[j]) - (m+n);
                }
            }
        
    
        return grid;
        
        
        
    }
}