
DATE : 10-March-2025
LEVEL : Medium
TOPIC : Set

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}