
DATE : 28-DEC-2025
LEVEL : Medium
TOPIC : PriorityQueue

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}