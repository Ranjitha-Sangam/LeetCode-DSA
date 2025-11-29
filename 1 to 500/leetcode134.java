
DATE : 29-NOV-2025
LEVEL : Medium
TOPIC : Greedy

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            int net=gas[i]-cost[i];
            totalGas+=net;
            tank+=net;
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(totalGas<0){
            return -1;
        }
        return start;
    }
}

// 1)TANK ---> Do we have enough gas to travel forward 
// so start from nxt index

// 2)if totalGas<0 mean You CANNOT complete the circuit 
// no matter where you start.

