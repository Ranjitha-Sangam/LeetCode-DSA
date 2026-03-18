
DATE : 18-March-2025
LEVEL : Easy
TOPIC : Array

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk=0;
        int empty=0;
        int full=numBottles;

        while(full>0){
            drunk+=full;
            empty +=full;
            full=empty/numExchange;
            empty=empty % numExchange;
        }
        return drunk;
    }
}