class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList();
        HashMap<Integer, Integer> hash = new HashMap();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0 ; i<matches.length;i++){
            if(hash.containsKey(matches[i][1])){
                hash.put(matches[i][1] , hash.get(matches[i][1]) + 1);
            }else{
                 hash.put(matches[i][1] , 1);
            
                }
         }
        
       
        HashSet<Integer> s = new HashSet(); 
          for(int i=0 ; i<matches.length;i++){
            if(!hash.containsKey(matches[i][0])){
                s.add(matches[i][0]);
            }
         }
        
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if(entry.getValue()==1){
                pq.add(entry.getKey());
            }
        }
        
         List<Integer> losers= new ArrayList();
        
         while (!pq.isEmpty()) {
            losers.add(pq.poll());
        }
        
        
        for (Integer e : s) {
            
                pq.add(e);
            
        }
        
        List<Integer> winners= new ArrayList();
        
          while (!pq.isEmpty()) {
            winners.add(pq.poll());
        }
        
        
       
        
        answer.add(winners);
        answer.add(losers);
        
        return answer;
        
        

        
    }
}