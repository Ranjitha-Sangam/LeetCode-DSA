
DATE : 31-JAN-2026
LEVEL : Easy
TOPIC : String 

class Solution {
    public void reverseString(char[] s) {
        int lp=0;
        int rp=s.length-1;
        while(lp<rp){
            char a=s[lp];
            s[lp]=s[rp];
            s[rp]=a;
            lp++;
            rp--;
        } 
    }
}