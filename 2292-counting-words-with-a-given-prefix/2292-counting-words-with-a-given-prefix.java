class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;

        for(int i=0 ; i<words.length ; i++){

            int ind = 0;
            while(ind < pref.length() && ind <words[i].length() && words[i].charAt(ind) == pref.charAt(ind)){
                ind++;
            }

            if(ind == pref.length())    count++;
        }
        
        return count;
    }
}