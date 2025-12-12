
DATE :12-DEC-2025
LEVEL : Easy
TOPIC : Array

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int boundary=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0) boundary++;
        }
        return boundary;
    }
}