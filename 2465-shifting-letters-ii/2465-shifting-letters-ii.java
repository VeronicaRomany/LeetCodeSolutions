class Solution {
    public String shiftingLetters(String s, int[][] shifts) {

        int[] totalShift = new int[s.length()+1];
        char[] str = s.toCharArray();

        for(int i=0 ; i<shifts.length;i++){
            if(shifts[i][2] == 1){
                totalShift[shifts[i][0]] +=1;
                totalShift[shifts[i][1]+1] += -1;

                // for(int j=shifts[i][0] ; j<= shifts[i][1] ; j++){
                //     totalShift[j]++;
                // }
            }else{

                totalShift[shifts[i][0]] += -1;
                totalShift[shifts[i][1]+1] += 1;
                // for(int j=shifts[i][0] ; j<= shifts[i][1] ; j++){
                //     totalShift[j]--;
                // }
            }
        }

        for(int i=1 ; i<totalShift.length;i++){
            totalShift[i] += totalShift[i-1];
        }

       

        for(int i=0 ; i<str.length;i++){
           int shift = (totalShift[i] % 26);
            str[i] = (char) ((str[i] - 'a' + shift + 26) % 26 + 'a');
        }
        
        return String.valueOf(str);
    }
}