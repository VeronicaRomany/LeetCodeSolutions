class Solution {
    public int minOperations(int[] nums) {
        
        int out =0;
        HashMap<Integer,Integer> h = new HashMap();
        
        for(int i=0 ; i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);
            }else{
                h.put(nums[i], 1);
            }
        }
                     
         for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
             // System.out.println(entry.getKey() + " : " + entry.getValue());
             if(entry.getValue()==1 ){
                 return -1;
             }else{
                 out += Math.ceil((double) entry.getValue()/3);
             }
             // System.out.println(out);
        }
                      
        return out;
        
    }
}