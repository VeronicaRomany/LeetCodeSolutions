class Solution {
    public boolean isPathCrossing(String path) {
        int [] xDiff = {0 , 0 , 1 , -1};
        int [] yDiff = {1 , -1 , 0 , 0};
        
        char [] directions = path.toCharArray();
        int x=0;
        int y=0;
        
        HashSet <Pair<Integer, Integer>> set = new HashSet();
        set.add(new Pair<>(x,y));
        
        for(int i=0 ; i<directions.length;i++){
            int prevLen = set.size();
            if(directions[i]=='N'){
                x += xDiff[0];
                y += yDiff[0];
                set.add(new Pair<>(x,y));
            }else if(directions[i]=='S'){
                x += xDiff[1];
                y += yDiff[1];
                set.add(new Pair<>(x,y));
            }else if (directions[i]=='E'){
                x += xDiff[2];
                y += yDiff[2];
                set.add(new Pair<>(x,y));
            }else{
                x += xDiff[3];
                y += yDiff[3];
                set.add(new Pair<>(x,y));
            }
            
            if(set.size()==prevLen) return true;
            
        }
        
        return false;
        
    }
}