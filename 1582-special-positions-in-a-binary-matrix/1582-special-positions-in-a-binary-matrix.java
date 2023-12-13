class Solution {
    public int numSpecial(int[][] mat) {
        
        int [] rowCount = new int [mat.length];
        int [] rowPos = new int [mat.length];
        int [] colCount = new int [mat[0].length];
        // int [] colPos = new int [mat[0].length];
        int out=0;
        
        for(int i=0 ;i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length;j++ ){
                
                if(mat[i][j]==1){
                    rowCount[i]++;
                    rowPos[i]  = j;
                    colCount[j]++;
                    
                }
            }
            
            // System.out.println(i);
            // System.out.println(rowPos[i]);
            // System.out.println(colCount[rowPos[i]]);
            // System.out.println("-----------------------------");
            
            
        }
        
        for(int i=0 ; i< rowCount.length ; i++){
            if(rowCount[i]==1 && colCount[rowPos[i]]==1){
                out++; 
            }
        }
        
        
        
        
        
        

        
        return out;
        
    }
}