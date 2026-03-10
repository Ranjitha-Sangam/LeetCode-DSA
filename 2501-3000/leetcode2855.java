
DATE : 09-March-2026
LEVEL : Easy
TOPIC : Array

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size();
        int i=1;
        while(i<n && nums.get(i-1)<nums.get(i)){
            i++;
        }
        if(i==n){
            return 0;
        }
        for(int j=i;j<n;j++){

            if((j>i && nums.get(j-1)>nums.get(j)) || nums.get(j)>nums.get(0) ){
                return -1;
            }
        }
        return n-i;
        
    }
}