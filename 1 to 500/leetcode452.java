
DATE : 02-April-2026
LEVEL : Medium
TOPIC : Greedy,Sorting


class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length==0){
            return 0;
        }
        Arrays.sort(points,Comparator.comparingInt(o->o[1]));
        int arrows=1;
        int arrowPosition=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>arrowPosition){
                arrows++;
                arrowPosition=points[i][1];
            }
        }
        return arrows;
    }
}