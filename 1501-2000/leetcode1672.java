
DATE : 11-JAN-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxMoney=0;
        for(int [] customer :accounts){
            int sum=0;
            for(int money:customer){
                sum+=money;
            }
            maxMoney=Math.max(sum,maxMoney);
        }
        return maxMoney;
    }
}