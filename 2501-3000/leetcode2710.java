
DATE : 13-FEB-2026
LEVEL : Easy
TOPIC : String

class Solution {
public String removeTrailingZeros(String num) {
        int n=num.length();
            int i=n-1;
            while(i>=0 && num.charAt(i)=='0'){
                i--;
            }
        return num.substring(0,i+1);
    }
}