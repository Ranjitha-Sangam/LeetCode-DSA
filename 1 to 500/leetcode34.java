
DATE : 27-DEC-2025
LEVEL : Medium
TOPIC : Binary Search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=occur(nums,target,true);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last=occur(nums,target,false);
        return new int[]{first,last};
    }
    private int occur(int[] nums,int target,boolean first){
        int ans=-1,start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(first){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}