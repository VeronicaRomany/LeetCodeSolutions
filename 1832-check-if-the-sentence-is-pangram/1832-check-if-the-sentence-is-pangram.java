class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] check = new boolean[26];

        for(int i=0 ; i<sentence.length();i++){
            check[ (int) (sentence.charAt(i)-'a')] = true ;
        }

        for(int i=0 ; i<26 ; i++){
            if(!check[i]){
                return false;
            }
        }

        return true;
        
    }
}