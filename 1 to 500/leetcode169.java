
DATE : 02-OCT-2025
LEVEL : Easy
TOPIC : Boyer-Moore-Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            count+=nums[i]==candidate?1:-1;
        }
        return candidate;
        
    }
}


DATE : 04-FEB-2026
LEVEL : Easy
TOPIC : HASHMAP

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}