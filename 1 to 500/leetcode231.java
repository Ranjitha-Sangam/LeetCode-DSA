
DATE : 29-March-2026
LEVEL : Easy
TOPIC : Bit Manipulation

class Solution {

    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}