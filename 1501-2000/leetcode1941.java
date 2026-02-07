
DATE : 18-JAN-2026
LEVEL : Easy
TOPIC : String

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int expected=0;
        for(int f:freq){
            if(f!=0){
                if(expected==0){
                    expected=f;
                }else if(f!=expected){
                    return false;
                }
            }
        }
       return true;
    }
}