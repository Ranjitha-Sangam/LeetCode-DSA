
DATE : 27-NOV-2025
LEVEL : Medium
TOPIC : Greedy

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,Comparator.comparingInt(o->o[1]));

        int count=0;
        int lastEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastEnd){
                count++;
            }else{
                lastEnd=intervals[i][1];
            }
        }
        return count;
    }
}