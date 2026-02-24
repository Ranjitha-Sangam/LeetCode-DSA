
DATE : 24-FEB-2026
LEVEL : Easy
TOPIC : String

class Solution {
    public int reverseDegree(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int sum='z'-s.charAt(i)+1;
            int product=(i+1)*sum;
            result+=product;
        }
        return result;
    }
}