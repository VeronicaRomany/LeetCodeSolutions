class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int start =0;
        int end = mat.length -1;
        
        for(int i=0 ; i<mat.length ; i++){
            sum += mat[i][i] + mat[start++][end--];
        }
        
        if(mat.length%2!=0) sum-=mat[mat.length/2][mat.length/2];
        
        return sum;
        
    }
}