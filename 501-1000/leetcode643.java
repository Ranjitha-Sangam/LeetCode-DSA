
DATE : 18-FEB-2026
LEVEL : Easy
TOPIC : Sliding Window

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        double maxAvgSum=windowSum;
        for(int i=k;i<n;i++){
            windowSum+=nums[i]-nums[i-k];
            maxAvgSum=Math.max(maxAvgSum,windowSum);
        }
        return maxAvgSum/k;
      
    }
}