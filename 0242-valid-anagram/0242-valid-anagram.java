class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        
        int [] check1 = new int [26];
        int [] check2 = new int [26];
        
        
        for(int i=0 ; i<s.length();i++){
           
            check1[s.charAt(i)-'a'] ++;
            
            check2[t.charAt(i)-'a'] ++;
            
        }
        
        for(int i=0 ; i< 26 ; i++){
            
            if(check1[i] != check2[i])  return false;
        }
        
        return true;
    }
}