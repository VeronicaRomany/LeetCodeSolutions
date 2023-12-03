class Solution {
    public int firstUniqChar(String s) {
        
        HashMap <Character, Integer> map = new HashMap();
        
        char [] str = s.toCharArray();
        
        for(int i= 0 ; i <str.length ; i++){
           if(map.containsKey(str[i])){
               map.put(str[i], map.get(str[i])+1);
           }else{
                map.put(str[i], 1);
           }
        }
        
         for(int i= 0 ; i <str.length ; i++){
           if( map.get(str[i]) == 1) return i;
        }
        
        
        
        return -1;
      
    }
}