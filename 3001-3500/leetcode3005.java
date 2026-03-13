
DATE : 13-March-2026
LEVEL : Easy
TOPIC : HashMap

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int maxFreq=0;
        for(int f:freq.values()){
            maxFreq=Math.max(maxFreq,f);
        }
        int res=0;
        for(int f:freq.values()){
            if(f==maxFreq){
                res+=f;
            }
        }
        return res;
    }
}