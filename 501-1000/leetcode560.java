
DATE : 16-OCT-2025
LEVEL : Medium
TOPIC : Arrays

Brute Force --->TC : O(n²)

class Solution {
    public int subarraySum(int[] nums, int k) {
      
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }

            }
        }
        return count;
    }
}



DATE : 09-FEB-2026
LEVEL : Medium
TOPIC : HashMap(Optimal)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}