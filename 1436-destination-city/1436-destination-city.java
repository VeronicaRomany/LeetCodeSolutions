class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> h = new HashSet<>();
        
        for(int i=0 ; i<paths.size();i++){
            h.add(paths.get(i).get(0));
        }
        
        for(int i=0 ; i<paths.size();i++){
            if(!h.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        
        return new String();
        
    }
}