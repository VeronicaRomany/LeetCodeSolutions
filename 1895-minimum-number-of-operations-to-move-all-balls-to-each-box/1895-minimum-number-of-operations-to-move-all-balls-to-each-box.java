class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];

        char[] Boxes = boxes.toCharArray();

        for(int i=0 ; i<answer.length;i++){

            for(int j=0 ; j<Boxes.length ; j++){
                if(j!=i && Boxes[j]=='1'){
                    answer[i] += Math.abs(i-j);
                }
            }
        }
        return answer;
    }    
}