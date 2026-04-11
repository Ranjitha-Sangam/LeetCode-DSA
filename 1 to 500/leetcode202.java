
DATE : 11-April-2026
LEVEL : Easy
TOPIC : Slow-Pointer Approach

class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=sumsq(n);
        while(fast!=1 && fast!=slow){
            slow=sumsq(slow);
            fast=sumsq(sumsq(fast));
        }
        return fast==1;
    }
    
    public int sumsq(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}

DATE : 11-April-2026
LEVEL : Easy
TOPIC : HashSet

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=sumsq(n);
        }
        return true;
    }
    public int sumsq(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
     }
}