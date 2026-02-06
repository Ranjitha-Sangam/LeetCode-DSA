
DATE : 01-OCT-2025
LEVEL : Easy
TOPIC : Bit Manipulation(XOR)


class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        return res;   
    }
}


DATE : 06-FEB-2026
LEVEL : Easy
TOPIC : HashSet

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        return set.iterator().next();
    }
}
// Every pair gets added then removed
// Only the single number is left,thats y we did return set.iterator().next();