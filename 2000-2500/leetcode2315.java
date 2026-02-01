
DATE : 01-FEB-2026
LEVEL : Easy
TOPIC : String 
//counting stars when the bar number is even

class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int countBars=0;
        int countStars=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='|'){
                countBars++;
            }
            if(countBars%2==0){
                if(ch=='*'){
                    countStars++;
                }
            }
        }
        return countStars;
    }
}
