
DATE : 30-NOV-2025
LEVEL : Easy
TOPIC : Arrays (time complexity :On2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res =new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> rows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    rows.add(1);
                }else{
                    int val=res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    rows.add(val);
                }
            }
            res.add(rows);
        }
        return res;
    }
}