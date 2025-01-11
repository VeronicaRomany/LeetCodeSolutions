class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        char[] S = s.toCharArray();

        int[] freqArray = new int[26];

        for(int i=0 ; i<S.length ; i++){
            freqArray[S[i]-'a']++;
        }

        int oddCount = 0;

        for(int i=0 ; i<26 ;i++){
            if(freqArray[i]%2 !=0) oddCount++;
        }

        return oddCount <= k ? true : false; 
    }
}