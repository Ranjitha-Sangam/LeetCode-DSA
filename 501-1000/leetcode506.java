
DATE : 31-DEC-2025
LEVEL : Easy
TOPIC : PriorityQueue

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] res=new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->b[0]-a[0]
        );
        for(int i=0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }
        int rank=1;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int idx=curr[1];

            if(rank==1){
                res[idx]="Gold Medal";
            }else if(rank==2){
                res[idx]="Silver Medal";
            }else if(rank==3){
                res[idx]="Bronze Medal";
            }else{
                res[idx]=String.valueOf(rank);
            }
            rank++;
        }
        return res;
    }
}