class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int count=0;
        HashSet <Character> h = new HashSet();
        
        for(int i=0 ; i<s.length()-2 ; i++){
            int right = s.length()-1;
            
            if(!h.contains(s.charAt(i))){
                while(right - i > 1){
                    if(s.charAt(i) == s.charAt(right)){
                        String sub = s.substring(i+1, right);
                        count += sub.chars().distinct().count();
                        h.add(s.charAt(i));
                        break;
                    }
                    right--;
                }
            }
            
        }
        
        return count;
        
//         int left = 0;
//         int right = s.length()-1;
//         int count = 0;
//         String temp ="";
        
//         while(left < right && (right-left + 1) >= 3){
            
            
//             String sub = s.substring(left+1, right);
            
//             System.out.println(left + " "+ right );
            
//             if(s.charAt(left) == s.charAt(right) && temp.indexOf(sub) == -1){
                
//                 count += sub.chars().distinct().count();
//                 temp = sub;
               
//             }
            
            
//                 if(s.charAt(left) == s.charAt(right-1)){
//                     right--;
//                 }else if(s.charAt(right) == s.charAt(left+1)){
//                     left++;
//                 }else{
//                     left++;
//                     right--;
//                 }
          
//             }
        
        
//         return count;
        
    }
}