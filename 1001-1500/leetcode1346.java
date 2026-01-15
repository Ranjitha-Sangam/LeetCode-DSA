
DATE : 15-JAN-2026
LEVEL : Easy
TOPIC : HashSet

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(hs.contains(num*2)||(num%2==0 && hs.contains(num/2))){
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}
