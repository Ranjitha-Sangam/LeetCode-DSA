
DATE : 02-JAN-2026
LEVEL : Easy
TOPIC : PriorityQueue

class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int g:gifts){
            pq.offer(g);
        }
        int count=0;
        while(count<k){
            int max=pq.poll();
            int reducedGifts=(int)Math.sqrt(max);
            pq.offer(reducedGifts);
            count++;
        }
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}