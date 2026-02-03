
DATE : 03-JAN-2026
LEVEL : Easy
TOPIC : Array

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int freq[]=new int[101];
        for(int n:nums){
            freq[n]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}