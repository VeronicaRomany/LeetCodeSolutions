class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        
        int out=0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i=0;
        int j=0;
        
        
        while(i<s.length && j<g.length){
            if(s[i]>=g[j]){
                out++;
                j++;
            }
            i++;
            
        }
        
        return out;
        
    }
}