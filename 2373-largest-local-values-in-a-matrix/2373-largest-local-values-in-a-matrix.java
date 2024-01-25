class Solution {
    
    private int getMax(int i , int j , int [][] grid){
        int [] dx = {-1,-1,-1,0,0,0,1,1,1};
        int [] dy = {-1,0,1,-1,0,1,-1,0,1};
        int max =0;
        
        for(int x=0 ; x<9;x++){
            max = Math.max(max , grid[i+dx[x]][j+dy[x]]);
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        
        int [][] maxLocal = new int [grid.length-2][grid.length-2];
        
        for(int i=0 ; i<maxLocal.length;i++){
            for(int j=0 ; j<maxLocal.length;j++){
                
                maxLocal[i][j] = getMax(i+1,j+1, grid);
                
            }
        }
        
        return maxLocal;
        
    }
}