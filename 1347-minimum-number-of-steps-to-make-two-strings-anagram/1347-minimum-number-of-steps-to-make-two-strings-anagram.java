class Solution {
    public int minSteps(String s, String t) {
        int steps = 0;
        int [] freq_s = new int [26];
        int [] freq_t = new int [26];
        
        
        for(int i=0 ; i<s.length();i++){
            freq_s[s.charAt(i)-'a']++;
            freq_t[t.charAt(i)-'a']++;
        }
        
        for(int i=0 ; i<26 ; i++){
            if(freq_t[i]<freq_s[i])     steps+=(freq_s[i]-freq_t[i]);
        }
        
        return steps;
        
        
    }
}