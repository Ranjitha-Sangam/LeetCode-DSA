
DATE : 08-April-2026
LEVEL : Easy
TOPIC : Arrays,sorting

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            minDiff=Math.min(minDiff,arr[i+1]-arr[i]);
        }
        List<List<Integer>> finList=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==minDiff){
                finList.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return finList;
    }
}