class Solution {
    public String longestPalindrome(String s) {
        
        char [] input = s.toCharArray();
        int maxLen=0;
        int maxStart=0;
        int maxEnd=0;
        int left=0;
        int right=0;
        
        
     
            
           for(int i = 0; i < input.length; i++) {
            
            // For odd-length palindromes
            left = i - 1;
            right = i + 1;
            while(left >= 0 && right < input.length && input[left] == input[right]) {
                if(right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    maxStart = left;
                    maxEnd = right;
                }
                left--;
                right++;
            }
            
            // For even-length palindromes
            left = i;
            right = i + 1;
            while(left >= 0 && right < input.length && input[left] == input[right]) {
                if(right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    maxStart = left;
                    maxEnd = right;
                }
                left--;
                right++;
            }
        }
        
        
        // System.out.println(maxStart + " " + maxEnd);
        
        StringBuilder sb = new StringBuilder();
        for (int i = maxStart; i <= maxEnd; i++) {
            sb.append(input[i]);
        }

        // Return the substring
        return sb.toString();
            
     }
}
        
        
