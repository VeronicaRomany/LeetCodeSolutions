class Solution {
    public boolean makeEqual(String[] words) {
        int [] freq = new int [26];
        
        for(int i=0 ; i<words.length;i++){
            for(int j=0 ; j<words[i].length();j++){
                    freq[words[i].charAt(j)-'a']++;
             }
        }
        
        int n = words.length;
        for(int i =0 ; i < freq.length;i++){
            if(freq[i]%n !=0){
                return false;
            }
        }
        
        return true;
        
    }
}