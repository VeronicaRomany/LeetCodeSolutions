class Solution {
    public int maxProductDifference(int[] nums) {
     
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqReversed = new PriorityQueue<>(Collections.reverseOrder());
        
        
        
        for(int i=0 ; i<nums.length ; i++){
            pq.add(nums[i]);
            pqReversed.add(nums[i]);
        }
        
       
        
        
        return pqReversed.poll() * pqReversed.poll() - pq.poll() * pq.poll();
        
    }
}