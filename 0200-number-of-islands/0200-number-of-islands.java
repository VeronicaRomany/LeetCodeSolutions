class Solution {
    private void mergeIsland(char[][] grid , int i , int j){
        if( i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] !='1' ) return;
        
        int [] dx = {-1 , 1 , 0 , 0};
        int [] dy = {0, 0 , 1, -1};
        grid[i][j]= ' ';
        
        for(int k=0 ; k<4 ; k++){
              mergeIsland(grid , i+dx[k] , j+dy[k]);
        }
      
    }
    public int numIslands(char[][] grid) {
        
        int count =0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    
                    mergeIsland(grid , i , j );
                }
            }
        }
        
        return count;
        
    }
}