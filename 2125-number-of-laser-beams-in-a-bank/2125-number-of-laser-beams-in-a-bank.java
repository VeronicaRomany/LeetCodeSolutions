class Solution {
    public int numberOfBeams(String[] bank) {
        int out=0;
        int [] oneCount = new int [bank.length];
        
        for(int i=0 ; i<bank.length;i++){
            int count =(int)( bank[i].chars().filter(ch -> ch == '1').count());
            oneCount[i]=count;
        }
        
//         for(int i=0 ; i<oneCount.length;i++){
//             System.out.println(oneCount[i]);
//         }
        
        
        int start =0; 
        int end = 1;
        
        while(start<end && end <oneCount.length){
            if(oneCount[end] == 0){
                end++;
            }else {
                
            
                out += oneCount[start]*oneCount[end];
                start=end;
                end = start+1;
            }
        }
        
        return out;
        
        
    }
}