
DATE : 11-March-2026
LEVEL : Easy
TOPIC : Math and Array

//O(n)

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=0){
            return false;
        }
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}

//Optimal O(sqrt of n)

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            return false;
        }
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                sum+=i;
                if(i!=num/i){
                    sum+=num/i;
                }
            }
        }
        return sum==num;
    }
}