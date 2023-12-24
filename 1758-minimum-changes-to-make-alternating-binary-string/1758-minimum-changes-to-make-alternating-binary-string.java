class Solution {
    public int minOperations(String s) {
        
        if(s.length()==1){
            return 0;
        }

        char[] option1 = new char[s.length()]; // start with 0
        char[] option2 = new char[s.length()]; // start with 1

        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i = i + 2) {
                option1[i] = '0';
                option1[i + 1] = '1';
                option2[i] = '1';
                option2[i + 1] = '0';
            }
        } else {

            for (int i = 0; i < s.length() - 1; i = i + 2) {
                option1[i] = '0';
                option1[i + 1] = '1';
                option2[i] = '1';
                option2[i + 1] = '0';
            }
            
            if(option1[s.length() - 2] == '0'){
                option1[s.length() - 1] = '1';
            }else{
                option1[s.length() - 1] = '0';
            }
            
            if(option2[s.length() - 2] == '0' ){
                option2[s.length() - 1] = '1';
            }else{
                option2[s.length() - 1] = '0';
            }


        }

        char[] in = s.toCharArray();
        int min1 = 0;
        int min2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (in[i] != option1[i]) min1++;
            if (in[i] != option2[i]) min2++;
        }

        return Math.min(min1, min2);

    }
}
