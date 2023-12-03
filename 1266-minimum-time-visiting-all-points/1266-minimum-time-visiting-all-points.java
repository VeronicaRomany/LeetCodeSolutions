class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int minDistance = 0;
        int dx=0;
        int dy=0;

        for(int i=1 ; i<points.length;i++){
            if(points[i][0] > points[i-1][0]){
                dx = points[i][0] - points[i-1][0];
            }else{
                dx = points[i-1][0] - points[i][0];
            }

            if(points[i][1] > points[i-1][1]){
                dy =  points[i][1] - points[i-1][1];
            }else{
                dy =  points[i-1][1] - points[i][1];
            }
            minDistance += Math.max(dx,dy);
        }
        return minDistance;
    }
}