
DATE : 01-JAN-2026
LEVEL : Easy
TOPIC : PriorityQueue

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        Set<Integer> seen=new HashSet<>();

        for(int n:nums){
            if(seen.contains(n)) 
            continue;
            seen.add(n);
            pq.offer(n);

           if(pq.size()>3){
            pq.poll();
           }
        }
        if(pq.size()<3){
            int max=Integer.MIN_VALUE;
            for(int n:pq){
                max=Math.max(max,n);
            }
            return max;
        }
        return pq.poll();
    }
}