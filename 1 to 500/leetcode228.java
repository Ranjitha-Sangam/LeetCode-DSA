
DATE : 21-FEB-2026
LEVEL : Easy
TOPIC : Array

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> ans = new ArrayList<>();
        if(n==0){
            return ans;
        }
        int start=nums[0];
        for(int i=1;i<=n;i++){
            if(i==n || nums[i]!=nums[i-1]+1){
                if(start==nums[i-1]){
                    ans.add(String.valueOf(start));
                }else{
                    ans.add(start + "->" + nums[i-1]);
                }
                if(i<n){
                    start=nums[i];
                }
            }
        }
        return ans;
    }
}