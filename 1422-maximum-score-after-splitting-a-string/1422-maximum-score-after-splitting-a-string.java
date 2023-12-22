class Solution {
    public int maxScore(String s) {
        int max = 0;
        char [] input = s.toCharArray();
        
        int [] zeroCount = new int [s.length()];
        int [] oneCount = new int [s.length()];
        
        if(input[0]=='0'){
            zeroCount[0]=1;
            oneCount[0]=0;
        }else{
            zeroCount[0]=0;
            oneCount[0]=1;
        }
        
        for(int i=1 ; i< input.length ; i++){
            if(input[i] == '0'){
                zeroCount[i] = zeroCount[i-1]+1;
                oneCount[i] = oneCount[i-1];
            }else{
                zeroCount[i] = zeroCount[i-1];
                oneCount[i] = oneCount[i-1]+1;
            }
        }
        
        for(int i=0 ; i< input.length-1 ; i++){
            max = Math.max(max , zeroCount[i] + (oneCount[oneCount.length-1]-oneCount[i]));
        }
        
        return max;
        
        
        
    }
}