class Solution {
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c == 'o' || c=='u'|| c=='i' ||
                c== 'A'|| c== 'E'|| c== 'I'|| c== 'O'|| c== 'U';
    }
    
    public boolean halvesAreAlike(String s) {
        int count = 0;
        
        for(int i=0 ; i<s.length()/2 ;i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(s.length()-i-1)))   count--;
        }
        
        return count == 0;
    }
}