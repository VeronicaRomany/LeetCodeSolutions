class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        
        int [] Freq = new int [26];
        // int [] tFreq = new int [26];
        
        for(int i=0 ; i<s.length() ; i++){
            Freq[(int) (S[i]-'a')]++;
            Freq[(int) (T[i]-'a')]--;
        }
        
        for(int i=0 ; i<26;i++){
            if(Freq[i] != 0)        return false;
        }
        
        
        return true;
    }
}