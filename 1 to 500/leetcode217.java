
DATE : 04-March-2026
LEVEL : Easy
TOPIC : Arrays & HashSet

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

//Optimal
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}