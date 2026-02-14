
DATE : 14-FEB-2026
LEVEL : Easy
TOPIC : Array

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                int sum=nums.get(i)+nums.get(j);
                if(sum<target){
                    count++;
                }
            }
        }
        return count;
    }
}

//Approach- 02

class Solution {
    public int countPairs(List<Integer> nums, int target) {

        Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

        while (left < right) {

            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                count += (right - left);  // KEY TRICK 🔥
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
