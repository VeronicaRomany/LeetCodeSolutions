class Solution {
    int m;
    int n;
    boolean isFound = false;
    
    private void isExist(char[][] board ,char [] word , int start , int x , int y , boolean[][] visited) {
        
        if(x<0 || x>=m || y<0 || y>=n || visited[x][y] || word[start] != board[x][y]) return;
            
           
            if(start == word.length-1){
                 isFound=true;
                 return;
            }
            
            visited[x][y]=true;
        

            isExist(board, word , start+1 , x+1 , y , visited);
            isExist(board, word , start+1 , x-1 , y, visited);
            isExist(board, word , start+1 , x , y+1, visited);
            isExist(board , word , start+1 , x , y-1 ,visited);
        
             visited[x][y] = false;
            
    }
    
    
    public boolean exist(char[][] board, String word) {
        
        m= board.length;
        n = board[0].length;
        
        boolean [][] visited = new boolean[m][n]; 
        
        char [] search = word.toCharArray();
        
        for(int i=0 ; i< m ; i++){
            for(int j=0 ; j<n ; j++){
                
                if(board[i][j]==search[0]){
                    
                 
            
                    isExist(board, search , 0, i , j , visited);
                    
                    if(isFound) return true;
                }
            }
        }
        
        return false;
        
    }
}