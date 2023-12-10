class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m = matrix.length;
        int n =matrix[0].length;
        
        if(m==n){
            for(int i=0 ; i<n ;i++){
                for(int j=i+1 ; j<m ; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i]=temp;
                }
            }

            return matrix;   
        }
        
        int [][] t = new int [n][m];
        
        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ; j++){
                   t[i][j] = matrix[j][i];
                }
            }
        
        return t;
        
        
   
    }
}