
DATE : 03-April-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPoint=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=insertPoint){
                    nums[insertPoint]=nums[i];
                    nums[i]=0;
                }
                insertPoint++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }        
    }
}