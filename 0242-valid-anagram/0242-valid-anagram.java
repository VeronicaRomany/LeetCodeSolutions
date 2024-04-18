class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        
        int [] sFreq = new int [26];
        int [] tFreq = new int [26];
        
        for(int i=0 ; i<s.length() ; i++){
            sFreq[(int) (S[i]-'a')]++;
            tFreq[(int) (T[i]-'a')]++;
        }
        
        for(int i=0 ; i<26;i++){
            if(sFreq[i] != tFreq[i])        return false;
        }
        
        
        return true;
    }
}