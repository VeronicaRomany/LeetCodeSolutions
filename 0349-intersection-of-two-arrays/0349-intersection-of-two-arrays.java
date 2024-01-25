class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean [] n1 = new boolean [1001];
        boolean [] n2 = new boolean [1001];
        
        for(int i=0 ; i<nums1.length;i++){
            n1[nums1[i]]=true;
        }
        
        for(int i=0 ; i<nums2.length;i++){
            n2[nums2[i]]=true;
        }
        
        for(int i=0;i<1001;i++){
            if(n1[i] && n2[i]) ans.add(i);
        }
        
        int [] answer = new int [ans.size()];
        
        for(int i=0 ; i<answer.length;i++){
            answer[i] = ans.get(i);
        }
        
        return answer;
    
    }
}