class Solution {
    public int[] decode(int[] encoded, int first) {
        int [] answer = new int [encoded.length+1];
        answer[0] = first;
        
        for(int i=1 ; i<answer.length ; i++){
            answer[i] = answer[i-1] ^ encoded[i-1];
        }
        
        return answer;
        
    }
}