class Solution {
    public List<Integer> getRow(int rowIndex) {
        int [][] pascal = new int [rowIndex+1][rowIndex+1];
        for(int i=0 ; i<=rowIndex ; i++){
            for(int j=0 ; j<=rowIndex ; j++){
                if(j==0 || i==j){
                    pascal[i][j] = 1;
                }else if(j<i){
                    pascal[i][j]=pascal[i-1][j] + pascal[i-1][j-1];
                }else{
                    pascal[i][j]=0;
                }
            }
        }
        
        List<Integer> row = new ArrayList();
        for(int i=0 ; i<=rowIndex ; i++){
            
            row.add(pascal[rowIndex][i]);
        }
        System.gc();
        return row;
    }
}