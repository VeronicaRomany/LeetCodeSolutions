class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int [] f1 = new int [26];
        int [] f2 = new int [26];
        boolean [] appear = new boolean [26];
        
        for(int i=0 ; i<s.length();i++){
            if(!appear[s.charAt(i)-'a']){
                f1[s.charAt(i)-'a']=i;
                appear[s.charAt(i)-'a']=true;
            }else{
                f2[s.charAt(i)-'a']=i;
            }
        }
        
        int longest = -1;
        
        for(int i=0 ; i<26 ; i++){
            if(f1[i]!=f2[i])    longest=Math.max(longest , f2[i] - f1[i] - 1);
        }
        
        return longest;
    }
}