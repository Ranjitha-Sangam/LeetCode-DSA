
DATE : 16-FEB-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int dif=-1;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            if(curr>min){
                dif=Math.max(dif,curr-min);
            }else{
                min=curr;
            }
        }
        return dif;
    }
}