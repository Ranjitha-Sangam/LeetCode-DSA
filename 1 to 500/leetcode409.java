
DATE : 06-FEB-2026
LEVEL : Easy
TOPIC : HashMap

class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==0 || n==1){
            return n;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int oddCount =0;
        for(int freq:map.values()){
            if(freq % 2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
            return n-oddCount+1;
        }
        return n;
    }
}

