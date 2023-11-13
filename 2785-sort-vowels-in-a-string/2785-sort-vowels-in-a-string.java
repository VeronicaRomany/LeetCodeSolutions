class Solution {
    private boolean isVowel (Character c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
           c=='A' || c=='E' || c=='I' || c=='O' || c=='U')  return true;
        return false;
    }
    public String sortVowels(String s) {
        
        PriorityQueue<Character> pq =
                new PriorityQueue<>();
        
        char[] charArray = s.toCharArray();
        
        
        for( int i=0 ; i< charArray.length ; i++){
            if(isVowel(charArray[i])){
                pq.add(charArray[i]);
                charArray[i]='-';
            }
        }
        
        if(pq.isEmpty()) return s;
        
        for( int i=0 ; i< charArray.length ; i++){
            if(charArray[i]=='-'){
                charArray[i] = pq.poll();
            }
        }
        
        return new String(charArray);
        
    }
}