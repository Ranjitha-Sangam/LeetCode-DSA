
DATE : 12-April-2026
LEVEL : Easy
TOPIC : Recursion

class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fib=fib(n-1)+fib(n-2);
        return fib;
    }
}


DATE : 12-April-2026
LEVEL : Easy
TOPIC : Math

class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int n1=0;
        int n2=1;
        int sum=0;
        for(int i=1;i<n;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        return sum;
    }
}