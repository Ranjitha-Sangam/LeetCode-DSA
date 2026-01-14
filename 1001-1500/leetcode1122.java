
DATE : 14-JAN-2026
LEVEL : Easy
TOPIC : HashMap

class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index=0;
        //placing a/c to arr2
        for(int num:arr2){
            int count=map.get(num);
            while(count-- >0){
                arr1[index++]=num;
            }
            map.remove(num);
        }
        //sort n place remaining elements
        List<Integer> remaining=new ArrayList<>(map.keySet());
        Collections.sort(remaining);

        for(int num:remaining){
            int count=map.get(num);
            while(count>0){
                arr1[index++]=num;
                count--;
            }
        }
        return arr1;
    }
}