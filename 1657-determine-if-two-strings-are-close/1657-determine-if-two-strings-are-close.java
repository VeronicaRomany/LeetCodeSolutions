class Solution {
    
    private int [] freqArray(String s){
        int [] f = new int [26];
        char [] ch =s.toCharArray();
        
        for(int i=0 ; i<ch.length;i++){
            f[ch[i]-'a']++;
        }
        
        return f;
    }
    
    
    private HashMap<Character,Integer> getfrequencyHash(String s){
        HashMap<Character,Integer> h = new HashMap();
        char [] ch =s.toCharArray();
        for(int i=0 ; i<ch.length;i++){
            if(h.containsKey(ch[i])){
                h.put(ch[i], h.get(ch[i])+1);
                
            }else{
                 h.put(ch[i],1);
                
            }
        }
        
        return h;
    }
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length() )   return false;
        
        int [] f1 = freqArray(word1);
        int [] f2 = freqArray(word2);
        
        for(int i=0 ; i<26;i++){
            if((f1 [i] ==0 && f2[i]!=0) || (f2[i]==0&& f1[i]!=0) )return false;
        }
        
        Arrays.sort(f1);
        Arrays.sort(f2);
    
        
        for(int i=0 ; i<26 ; i++){
            if(f1[i]!=f2[i]  ){
                return false;
            }     
                
        }
        
        return true;
        
        
    }
}