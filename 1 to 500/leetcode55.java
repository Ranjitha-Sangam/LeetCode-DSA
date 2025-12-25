
DATE : 25-DEC-2025
LEVEL : Medium
TOPIC : Array, Greedy

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
        }
        return true;
    }
}