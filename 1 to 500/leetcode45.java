
DATE : 28-NOV-2025
LEVEL : Medium
TOPIC : Greedy

class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int jumps=0;
        int currJump=0;
        int farthJump=0;
        for(int i=0;i<nums.length-1;i++){
            farthJump=Math.max(farthJump,i+nums[i]);
            if(i==currJump){
                jumps++;
                currJump=farthJump;
            }
        }
        return jumps;
    }
}