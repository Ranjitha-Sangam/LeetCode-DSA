
DATE : 17-JAN-2026
LEVEL : Easy
TOPIC : Arrays

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=0;
        int count=0;
        if(ruleKey.equals("type")){
            index=0;
        }else if(ruleKey.equals("color")){
            index=1;
        }else{
            index=2;
        }
        //count items that are matching
        for(List<String> item:items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}