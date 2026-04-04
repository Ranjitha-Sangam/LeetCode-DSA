
DATE : 04-April-2026
LEVEL : Easy
TOPIC : HashMap

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)<0){
                return c;
            }
        }
        return ' ';
    }
}