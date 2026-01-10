
DATE : 10-JAN-2026
LEVEL : Medium
TOPIC : PriorityQueue

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n=costs.length;
        long total=0;

        PriorityQueue<Integer> leftPQ=new PriorityQueue<>();
        PriorityQueue<Integer> rightPQ=new PriorityQueue<>();

        int left=0;
        int right=n-1;


        //for left heap
        for(int i=0;i<candidates && left<=right;i++){
            leftPQ.offer(costs[left++]);
        }
        //for right heap
        for(int i=0;i<candidates&&left<=right;i++){
            rightPQ.offer(costs[right--]);
        }
        
        while(k-->0){
            int leftMin=leftPQ.isEmpty()?Integer.MAX_VALUE:leftPQ.peek();
            int rightMin=rightPQ.isEmpty()?Integer.MAX_VALUE:rightPQ.peek();
            if(leftMin<=rightMin){
                total+=leftMin;
                leftPQ.poll();
                if(left<=right){ //adding remain elementsin the costs array
                    leftPQ.offer(costs[left++]);
                }
            }else{
                total+=rightMin;
                rightPQ.poll();
                if(left<=right){
                    rightPQ.offer(costs[right--]);
                }
            }
        }
        return total; 
    }
}