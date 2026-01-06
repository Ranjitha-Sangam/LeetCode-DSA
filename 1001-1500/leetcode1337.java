
DATE : 06-JAn-2026
LEVEL : Easy
TOPIC : PriorityQueue

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });

//count soldiers
        for(int i=0;i<mat.length;i++){
            int soldiers=0;
            for(int val:mat[i]){
                soldiers+=val;
            }
            pq.offer(new int[]{soldiers,i});
        }
//K weakest elements
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[1];
        }
        return res;
    }
}