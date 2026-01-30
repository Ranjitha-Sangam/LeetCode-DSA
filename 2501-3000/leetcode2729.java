
DATE : 30-JAN-2026
LEVEL : Easy
TOPIC : String + Math

class Solution {
    public boolean isFascinating(int n) {
       String sum=""+n+(2*n)+(3*n);

       if(sum.length()!=9){
        return false;
       }

       boolean freq[]=new boolean[10];

       for(char s:sum.toCharArray()){
        int digit=s-'0';

        if(digit==0 || freq[digit]){
            return false;
        }
        freq[digit]=true;
       }
       return true;
    }
}