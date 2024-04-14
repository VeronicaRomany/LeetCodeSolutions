class Solution {
    public String reorganizeString(String s) {
        char [] input = s.toCharArray();
        
        
        int [] frequencyArray = new int [26];
        int mostFreq=0;
        int mostFreqIndex=0;
        
        // calculate freeqArray 
        for(int i=0 ; i<input.length;i++){
            int index = (int)( input[i] - 'a' );
            frequencyArray[index]++;
            
            if(frequencyArray[index] > mostFreq){
                mostFreq=frequencyArray[index];
                mostFreqIndex = index;
            }
        }
        
        if(mostFreq > ((input.length + 1)/2))  return "";
        
        char [] output = new char [input.length];
        int index=0;
        
        // Fill even with the most freq element
        while(frequencyArray[mostFreqIndex] > 0){
            output[index] = (char)(mostFreqIndex + 'a');
            // mostFreq--;
            frequencyArray[mostFreqIndex]--;
            index+=2;
        }
        
        
        for(int i=0 ; i<frequencyArray.length ; i++){
            
            while(frequencyArray[i] != 0){
                
                if(index >= output.length){
                    index=1;
                }
                
                output[index] = (char)(i+'a');
                frequencyArray[i]--;
                index+=2;
            }
            
        }
        
        return String.valueOf(output);
        
        
        
        
        
        
        
        
        
    }
}