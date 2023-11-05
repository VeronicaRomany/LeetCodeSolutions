class Solution {
    public int getWinner(int[] arr, int k) {
        if(k > arr.length){
            int max = 0;
            for(int i=0 ; i<arr.length ; i++){
                max = Math.max(arr[i],max);
            }
            return max;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int countWinner = 0;
        int winner = arr[0] ;
        
        
        
        for(int i=1 ; i<arr.length ; i++) queue.add(arr[i]);
        
        while(countWinner<k && !queue.isEmpty() ){
            int temp = queue.remove();
            
            if(winner > temp){
                countWinner ++;
                queue.add(temp);
            }else{
                queue.add(winner);
                winner = temp;
                countWinner = 1;
            }
        }
        
        return winner;
    }
}