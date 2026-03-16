
DATE : 16-March-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int maxCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=1){
                count=0;
            }else{
                count++;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}