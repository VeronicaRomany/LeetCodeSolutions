class Solution {
    
    public int getMyValue(int [][] img , int pi , int pj ){
        
        int [] d = {-1 , 0 , 1};
        int innerPixels = 0;
        int val = 0;
        
        for(int i=0 ; i< 3 ; i++){
            int x = pi + d[i];
            
            for(int j=0 ; j<3 ; j++){
                int y = pj + d[j];
                
                if(x >= 0 && x< img.length && y>=0 && y < img[0].length){
                    // System.out.println(x + " "+ y);
                    val += img[x][y];
                    innerPixels ++;
                }
            }
        }
        
        // System.out.println(pi + " "+ pj + " "+ val + " "+ innerPixels);
        // System.out.println("-------------------------------------------");
        return (int) Math.floor(val/innerPixels);
      
    }
    public int[][] imageSmoother(int[][] img) {
        
        int [][] smoozed = new int [img.length][img[0].length];
        
        for(int i=0 ; i< img.length ; i++){
            for(int j=0 ; j< img[0].length ;j++){
                
                smoozed[i][j] = getMyValue(img , i , j);
            }
        }
        
        return smoozed;
        
    }
}