
DATE : 08-Jan-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op: operations){
            if(op.charAt(1)=='+'){
                x++;
            }else{
                x--;
            }
        }
        return x; 
    }
}