
DATE : 20-JAN-2026
LEVEL : Easy
TOPIC : Math,Array 

class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
            int need=nums[i-1]+1-nums[i];
            count+=need;
            nums[i]=nums[i-1]+1;
            }
        }
        return count;
    }
}